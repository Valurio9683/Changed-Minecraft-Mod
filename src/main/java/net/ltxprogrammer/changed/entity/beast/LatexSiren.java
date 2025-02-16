package net.ltxprogrammer.changed.entity.beast;

import net.ltxprogrammer.changed.effect.Shock;
import net.ltxprogrammer.changed.entity.Gender;
import net.ltxprogrammer.changed.entity.HairStyle;
import net.ltxprogrammer.changed.entity.TransfurMode;
import net.ltxprogrammer.changed.entity.UniqueEffect;
import net.ltxprogrammer.changed.entity.variant.LatexVariant;
import net.ltxprogrammer.changed.init.ChangedParticles;
import net.ltxprogrammer.changed.init.ChangedSounds;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class LatexSiren extends AbstractGenderedLatexShark implements UniqueEffect {
    public LatexSiren(EntityType<? extends LatexSiren> p_19870_, Level p_19871_) {
        super(p_19870_, p_19871_);
    }

    @Override
    public Gender getGender() {
        return Gender.FEMALE;
    }

    @Override
    public TransfurMode getTransfurMode() {
        return TransfurMode.ABSORPTION;
    }

    @Override
    public ChangedParticles.Color3 getHairColor(int layer) {
        return layer == 0 ? ChangedParticles.Color3.getColor("#ffffff") : ChangedParticles.Color3.getColor("#f3df60");
    }

    @Override
    public HairStyle getDefaultHairStyle() {
        return HairStyle.LONG_MESSY.get();
    }

    @Override
    public @Nullable List<HairStyle> getValidHairStyles() {
        return HairStyle.Collection.FEMALE.getStyles();
    }

    private boolean wantToSing() {
        return getTarget() != null;
    }

    @Override
    public String getEffectName() {
        return "siren_sing";
    }

    private int lastSingTick = 0;

    @Override
    public void effectTick(Level level, LivingEntity self) {
        if (self instanceof LatexSiren siren && !siren.wantToSing())
            return;

        if (lastSingTick < self.tickCount) {
            this.setSilent(self.isSilent());
            this.playSound(ChangedSounds.SIREN, 1, 1);
            lastSingTick = self.tickCount + (8 * 20) + 10;
        }

        level.getNearbyEntities(LivingEntity.class, TargetingConditions.DEFAULT, self,
                new AABB(self.blockPosition()).inflate(8)).forEach(livingEntity -> {
            if (LatexVariant.getEntityVariant(livingEntity) != null)
                return;

            Shock.setNoControlTicks(livingEntity, 5);
            if (!livingEntity.isOnGround())
                return;
            Random random = new Random(livingEntity.getId() + (livingEntity.tickCount / 10));
            Vec3 randomXZdir = new Vec3(random.nextDouble(-1, 1), 0, random.nextDouble(-1, 1));
            randomXZdir = randomXZdir.normalize();
            final double moveScale = livingEntity.getSpeed() * 0.8;
            livingEntity.travel(randomXZdir.multiply(moveScale, 0, moveScale));
        });
    }

    @Override
    public boolean isVisuallySwimming() {
        if (this.getUnderlyingPlayer() != null && this.getUnderlyingPlayer().isEyeInFluid(FluidTags.WATER))
            return true;
        return super.isVisuallySwimming();
    }
}
