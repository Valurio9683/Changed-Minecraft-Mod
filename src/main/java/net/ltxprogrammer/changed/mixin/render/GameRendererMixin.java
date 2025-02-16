package net.ltxprogrammer.changed.mixin.render;

import com.mojang.blaze3d.vertex.PoseStack;
import net.ltxprogrammer.changed.process.ProcessTransfur;
import net.ltxprogrammer.changed.util.Util;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@OnlyIn(Dist.CLIENT)
@Mixin(GameRenderer.class)
public abstract class GameRendererMixin {
    @Inject(method = "getNightVisionScale", at = @At("HEAD"), cancellable = true)
    private static void getNightVisionScale(LivingEntity livingEntity, float p_109110_, CallbackInfoReturnable<Float> callback) {
        ProcessTransfur.ifPlayerLatex(Util.playerOrNull(livingEntity), variant -> {
            if (variant.getParent().nightVision) {
                callback.setReturnValue(1.0f);
            }

            if (variant.getParent().getBreatheMode().canBreatheWater()) {
                callback.setReturnValue(0.85f);
            }
        });
    }

    @Inject(method = "bobView", at = @At("HEAD"), cancellable = true)
    private void bobView(PoseStack pose, float partialTicks, CallbackInfo callback) {
        ProcessTransfur.ifPlayerLatex(Util.playerOrNull(Minecraft.getInstance().getCameraEntity()), variant -> {
            if (!variant.getParent().hasLegs)
                callback.cancel();
        });
    }
}
