package net.ltxprogrammer.changed;

import net.ltxprogrammer.changed.client.EventHandlerClient;
import net.ltxprogrammer.changed.client.RecipeCategories;
import net.ltxprogrammer.changed.entity.HairStyle;
import net.ltxprogrammer.changed.entity.PlayerMover;
import net.ltxprogrammer.changed.init.*;
import net.ltxprogrammer.changed.network.ExtraJumpKeybind;
import net.ltxprogrammer.changed.network.VariantAbilityActivate;
import net.ltxprogrammer.changed.network.packet.*;
import net.ltxprogrammer.changed.util.PatreonBenefits;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Mod(Changed.MODID)
public class Changed {
    private static Changed instance;
    public static Changed getInstance() { return instance; }

    public static final String MODID = "changed";

    public static final Logger LOGGER = LogManager.getLogger(Changed.class);
    public static EventHandlerClient eventHandlerClient;
    public static ChangedConfig config;

    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(modResource(MODID), () -> PROTOCOL_VERSION,
            PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
    private static int messageID = 0;

    public Changed() {
        config = new ChangedConfig(ModLoadingContext.get());

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> MinecraftForge.EVENT_BUS.register(eventHandlerClient = new EventHandlerClient()));

        // Initialize packet types
        addNetworkMessage(CheckForUpdatesPacket.class, CheckForUpdatesPacket::new);
        addNetworkMessage(MountLatexPacket.class, MountLatexPacket::new);
        addNetworkMessage(SyncSwitchPacket.class, SyncSwitchPacket::new);
        addNetworkMessage(SyncTransfurPacket.class, SyncTransfurPacket::new);
        addNetworkMessage(SyncTransfurProgressPacket.class, SyncTransfurProgressPacket::new);
        addNetworkMessage(QueryTransfurPacket.class, QueryTransfurPacket::new);
        addNetworkMessage(VariantAbilityActivate.class, VariantAbilityActivate::new);
        addNetworkMessage(SyncVariantAbilityPacket.class, SyncVariantAbilityPacket::new);
        addNetworkMessage(MenuUpdatePacket.class, MenuUpdatePacket::new);
        addNetworkMessage(EmotePacket.class, EmotePacket::new);
        addNetworkMessage(SyncMoverPacket.class, SyncMoverPacket::new);

        addNetworkMessage(ExtraJumpKeybind.class, ExtraJumpKeybind::buffer, ExtraJumpKeybind::new,
                ExtraJumpKeybind::handler);

        instance = this;

        // Initialize (Note ModEventBus is a stack; first in - last out)

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //    vvv Last to process vvv
        HairStyle.REGISTRY.register(modEventBus);
        ChangedAbilities.REGISTRY.register(modEventBus);
        PlayerMover.REGISTRY.register(modEventBus);

        ChangedEnchantments.REGISTRY.register(modEventBus);
        ChangedRecipeSerializers.REGISTRY.register(modEventBus);
        ChangedFeatures.REGISTRY.register(modEventBus);
        ChangedBiomes.REGISTRY.register(modEventBus);
        ChangedBlockEntities.REGISTRY.register(modEventBus);
        ChangedFluids.REGISTRY.register(modEventBus);
        ChangedItems.REGISTRY.register(modEventBus);
        ChangedBlocks.REGISTRY.register(modEventBus);
        ChangedEntities.REGISTRY.register(modEventBus);
        //    ^^^ First to process ^^^
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            try {
                PatreonBenefits.loadBenefits();
                PatreonBenefits.UPDATE_CHECKER.start();
            } catch (Exception ex) {
                Changed.LOGGER.error("Failed to load Patreon Benefits. Patrons will not receive benefits visible to this client.");
                ex.printStackTrace();
            }
        });
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(RecipeCategories::registerCategories);
    }

    private static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
                                             BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
        PACKET_HANDLER.registerMessage(messageID++, messageType, encoder, decoder, messageConsumer);
    }

    private static <T extends ChangedPacket> void addNetworkMessage(Class<T> messageType, Function<FriendlyByteBuf, T> ctor) {
        addNetworkMessage(messageType, T::write, ctor, T::handle);
    }

    public static ResourceLocation modResource(String path) {
        return new ResourceLocation(MODID, path);
    }
    public static String modResourceStr(String path) {
        return MODID + ":" + path;
    }
}
