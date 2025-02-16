package net.ltxprogrammer.changed.mixin.block;

import net.ltxprogrammer.changed.block.NonLatexCoverableBlock;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.piston.PistonBaseBlock;
import net.minecraft.world.level.block.piston.PistonHeadBlock;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.StateHolder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.function.Function;

import static net.ltxprogrammer.changed.block.AbstractLatexBlock.COVERED;

@Mixin(StateDefinition.Builder.class)
public abstract class StateDefinitionMixin<O, S extends StateHolder<O, S>> {
    @Inject(method = "create", at = @At("HEAD"))
    public void create(Function<O, S> p_61102_, StateDefinition.Factory<O, S> p_61103_, CallbackInfoReturnable<StateDefinition<O, S>> callbackInfoReturnable) {
        var self = (StateDefinition.Builder<O, S>)(Object)this;
        if (self.owner instanceof Block ownerBlock) {
            if (!(ownerBlock instanceof NonLatexCoverableBlock || ownerBlock instanceof AirBlock || ownerBlock instanceof BaseFireBlock ||
                    ownerBlock instanceof CampfireBlock || ownerBlock instanceof TorchBlock || ownerBlock instanceof AbstractGlassBlock ||
                    ownerBlock instanceof RedStoneWireBlock || ownerBlock instanceof NoteBlock || ownerBlock instanceof StainedGlassPaneBlock ||
                    ownerBlock instanceof MagmaBlock || ownerBlock instanceof EndPortalFrameBlock || ownerBlock instanceof NetherPortalBlock ||
                    ownerBlock instanceof EndPortalBlock || ownerBlock instanceof EndGatewayBlock || ownerBlock instanceof BeaconBlock ||
                    ownerBlock instanceof IceBlock || ownerBlock instanceof PowderSnowBlock || ownerBlock instanceof SnowLayerBlock ||
                    ownerBlock instanceof AbstractCandleBlock || ownerBlock instanceof BarrierBlock || ownerBlock instanceof CommandBlock||
                    ownerBlock instanceof JigsawBlock || ownerBlock instanceof StructureBlock || ownerBlock instanceof LightBlock ||
                    ownerBlock instanceof StructureVoidBlock || ownerBlock instanceof LiquidBlock || ownerBlock instanceof ConduitBlock ||
                    ownerBlock instanceof DragonEggBlock || ownerBlock instanceof CropBlock || ownerBlock instanceof TurtleEggBlock ||
                    ownerBlock instanceof SpawnerBlock || ownerBlock instanceof AbstractCauldronBlock || ownerBlock instanceof AnvilBlock ||
                    ownerBlock instanceof PistonBaseBlock || ownerBlock instanceof PistonHeadBlock || ownerBlock instanceof ShulkerBoxBlock ||
                    ownerBlock instanceof BannerBlock || ownerBlock instanceof WetSpongeBlock || ownerBlock instanceof RailBlock || ownerBlock instanceof PoweredRailBlock ||
                    ownerBlock instanceof DetectorRailBlock || ownerBlock instanceof DaylightDetectorBlock || ownerBlock instanceof RespawnAnchorBlock ||
                    ownerBlock instanceof RepeaterBlock || ownerBlock instanceof ComparatorBlock || ownerBlock instanceof StemBlock || ownerBlock instanceof FurnaceBlock ||
                    ownerBlock instanceof BlastFurnaceBlock || ownerBlock instanceof SmokerBlock))
                self.add(COVERED);
        }
    }
}
