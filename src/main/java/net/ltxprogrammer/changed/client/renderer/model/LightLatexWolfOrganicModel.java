package net.ltxprogrammer.changed.client.renderer.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.ltxprogrammer.changed.Changed;
import net.ltxprogrammer.changed.client.renderer.animate.AnimatorPresets;
import net.ltxprogrammer.changed.client.renderer.animate.LatexAnimator;
import net.ltxprogrammer.changed.entity.beast.LightLatexWolfOrganic;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.HumanoidArm;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class LightLatexWolfOrganicModel extends LatexHumanoidModel<LightLatexWolfOrganic> implements LatexHumanoidModelInterface<LightLatexWolfOrganic, LightLatexWolfOrganicModel> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Changed.modResource("light_latex_wolf_organic"), "main");
    private final ModelPart RightLeg;
    private final ModelPart LeftLeg;
    private final ModelPart RightArm;
    private final ModelPart LeftArm;
    private final ModelPart Head;
    private final ModelPart Torso;
    private final ModelPart Tail;
    private final LatexAnimator<LightLatexWolfOrganic, LightLatexWolfOrganicModel> animator;

    public LightLatexWolfOrganicModel(ModelPart root) {
        super(root);
        this.RightLeg = root.getChild("RightLeg");
        this.LeftLeg = root.getChild("LeftLeg");
        this.Head = root.getChild("Head");
        this.Torso = root.getChild("Torso");
        this.Tail = Torso.getChild("Tail");
        this.RightArm = root.getChild("RightArm");
        this.LeftArm = root.getChild("LeftArm");
        animator = LatexAnimator.of(this).addPreset(AnimatorPresets.wolfLike(Head, Torso, LeftArm, RightArm, Tail, List.of(), LeftLeg, RightLeg));
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(52, 41).addBox(-2.0F, 12.0F, -2.75F, 4.0F, 2.0F, 4.0F, CubeDeformation.NONE), PartPose.offset(-2.5F, 10.0F, 0.0F));

        PartDefinition Toe_r1 = RightLeg.addOrReplaceChild("Toe_r1", CubeListBuilder.create().texOffs(40, 23).addBox(-2.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
                .texOffs(43, 22).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
                .texOffs(32, 44).addBox(-4.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.0F, 13.0F, -3.25F, -0.6109F, 0.0F, 0.0F));

        PartDefinition Toe_r2 = RightLeg.addOrReplaceChild("Toe_r2", CubeListBuilder.create().texOffs(24, 44).addBox(-1.0F, -3.001F, -1.5F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(28, 44).addBox(-2.5F, -3.001F, -1.5F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(44, 31).addBox(-4.0F, -3.001F, -1.5F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(2.0F, 16.0F, -1.75F, 0.0F, 0.0F, 0.0F));

        PartDefinition RightLowerLeg_r1 = RightLeg.addOrReplaceChild("RightLowerLeg_r1", CubeListBuilder.create().texOffs(0, 51).addBox(-1.995F, -7.5F, -1.0F, 4.0F, 6.0F, 3.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 14.25F, -1.25F, -0.5236F, 0.0F, 0.0F));

        PartDefinition RightMidLeg_r1 = RightLeg.addOrReplaceChild("RightMidLeg_r1", CubeListBuilder.create().texOffs(40, 0).addBox(-1.99F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 4.25F, -1.5F, 0.5672F, 0.0F, 0.0F));

        PartDefinition RightUpperLeg_r1 = RightLeg.addOrReplaceChild("RightUpperLeg_r1", CubeListBuilder.create().texOffs(44, 21).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(48, 11).addBox(-2.0F, 12.0F, -2.75F, 4.0F, 2.0F, 4.0F, CubeDeformation.NONE), PartPose.offset(2.5F, 10.0F, 0.0F));

        PartDefinition Toe_r3 = LeftLeg.addOrReplaceChild("Toe_r3", CubeListBuilder.create().texOffs(46, 11).addBox(-2.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
                .texOffs(46, 13).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
                .texOffs(8, 48).addBox(-4.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.0F, 13.0F, -3.25F, -0.6109F, 0.0F, 0.0F));

        PartDefinition Toe_r4 = LeftLeg.addOrReplaceChild("Toe_r4", CubeListBuilder.create().texOffs(24, 46).addBox(-1.0F, -3.001F, -1.5F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(0, 48).addBox(-2.5F, -3.001F, -1.5F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(4, 48).addBox(-4.0F, -3.001F, -1.5F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(2.0F, 16.0F, -1.75F, 0.0F, 0.0F, 0.0F));

        PartDefinition LeftLowerLeg_r1 = LeftLeg.addOrReplaceChild("LeftLowerLeg_r1", CubeListBuilder.create().texOffs(46, 47).addBox(-1.995F, -7.5F, -1.0F, 4.0F, 6.0F, 3.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 14.25F, -1.25F, -0.5236F, 0.0F, 0.0F));

        PartDefinition LeftMidLeg_r1 = LeftLeg.addOrReplaceChild("LeftMidLeg_r1", CubeListBuilder.create().texOffs(36, 36).addBox(-2.01F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 4.25F, -1.5F, 0.5672F, 0.0F, 0.0F));

        PartDefinition LeftUpperLeg_r1 = LeftLeg.addOrReplaceChild("LeftUpperLeg_r1", CubeListBuilder.create().texOffs(12, 44).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.5F, -4.0F, 8.0F, 8.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(12, 32).addBox(-2.0F, -2.5F, -6.0F, 4.0F, 2.0F, 2.0F, CubeDeformation.NONE)
                .texOffs(20, 17).addBox(-1.5F, -0.5F, -5.0F, 3.0F, 1.0F, 1.0F, CubeDeformation.NONE), PartPose.offset(0.0F, -1.5F, 0.0F));

        PartDefinition Snout_r1 = Head.addOrReplaceChild("Snout_r1", CubeListBuilder.create().texOffs(40, 21).addBox(-1.0F, -29.625F, -0.95F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.5F, 26.5F, 0.0F, 0.1745F, 0.0F, 0.0F));

        PartDefinition Hair = Head.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(24, 8).addBox(-2.0F, -35.0F, -4.0F, 4.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(36, 17).addBox(-4.0F, -34.5F, -3.5F, 8.0F, 1.0F, 3.0F, CubeDeformation.NONE)
                .texOffs(0, 60).addBox(2.0F, -34.95F, 0.0F, 2.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(16, 33).addBox(2.5F, -34.0F, -4.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.025F))
                .texOffs(24, 4).addBox(-3.5F, -33.0F, -4.25F, 7.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(0, 32).addBox(3.5F, -34.0F, -4.5F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(0, 16).addBox(-4.5F, -34.0F, -4.5F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(28, 54).addBox(2.5F, -31.0F, -1.0F, 2.0F, 2.0F, 5.0F, CubeDeformation.NONE)
                .texOffs(14, 54).addBox(-4.5F, -31.0F, -1.0F, 2.0F, 2.0F, 5.0F, CubeDeformation.NONE)
                .texOffs(32, 25).addBox(-4.5F, -34.0F, -4.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.025F))
                .texOffs(54, 58).addBox(-4.0F, -34.95F, 0.0F, 2.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(55, 17).addBox(-4.0F, -34.0F, -4.5F, 8.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(28, 47).addBox(-4.0F, -34.0F, 4.0F, 8.0F, 6.0F, 1.0F, CubeDeformation.NONE), PartPose.offset(0.0F, 26.5F, 0.0F));

        PartDefinition RightEar = Head.addOrReplaceChild("RightEar", CubeListBuilder.create().texOffs(0, 4).addBox(-1.495F, -1.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.05F))
                .texOffs(40, 11).addBox(-0.495F, -1.7F, -0.4F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.04F))
                .texOffs(34, 38).addBox(-0.495F, -2.1F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
                .texOffs(28, 33).addBox(0.505F, -3.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(-3.075F, -7.75F, 0.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition LeftEar = Head.addOrReplaceChild("LeftEar", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.05F))
                .texOffs(16, 36).addBox(-1.0F, -1.5F, -0.4F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.04F))
                .texOffs(28, 38).addBox(-1.0F, -2.1F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
                .texOffs(24, 19).addBox(-1.0F, -2.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(2.6F, -7.975F, 0.0F, 0.0F, 0.0F, 0.2618F));

        PartDefinition Torso = partdefinition.addOrReplaceChild("Torso", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, 0.5F, -2.0F, 8.0F, 12.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(24, 6).addBox(-3.0F, 2.5F, 1.5F, 6.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(56, 21).addBox(-3.0F, 0.5F, 1.75F, 6.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(52, 0).addBox(-4.0F, 0.5F, 1.5F, 8.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(58, 19).addBox(-3.0F, 3.5F, -2.5F, 6.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(24, 0).addBox(-4.0F, 0.5F, -2.5F, 8.0F, 3.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(28, 36).addBox(-2.0F, 2.5F, -2.75F, 4.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(57, 47).addBox(-3.0F, 0.5F, -2.75F, 6.0F, 2.0F, 1.0F, CubeDeformation.NONE), PartPose.offset(0.0F, -1.5F, 0.0F));

        PartDefinition LeftTuft_r1 = Torso.addOrReplaceChild("LeftTuft_r1", CubeListBuilder.create().texOffs(56, 3).addBox(-11.5F, -23.5F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 25.5F, 0.0F, 0.0F, 0.0F, 0.6109F));

        PartDefinition RightTuft_r1 = Torso.addOrReplaceChild("RightTuft_r1", CubeListBuilder.create().texOffs(55, 51).addBox(10.5F, -23.5F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 25.5F, 0.0F, 0.0F, 0.0F, -0.6109F));

        PartDefinition Tail = Torso.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 11.5F, 0.0F));

        PartDefinition Base_r1 = Tail.addOrReplaceChild("Base_r1", CubeListBuilder.create().texOffs(42, 56).addBox(-1.5F, 0.1914F, -1.4483F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.0F, 6.0F, 1.4835F, 0.0F, 0.0F));

        PartDefinition Base_r2 = Tail.addOrReplaceChild("Base_r2", CubeListBuilder.create().texOffs(52, 31).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 7.0F, 3.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1781F, 0.0F, 0.0F));

        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(24, 17).addBox(-3.0F, -1.5F, -2.0F, 4.0F, 12.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(52, 41).addBox(0.0F, 10.25F, -2.0F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(48, 38).addBox(-3.0F, 10.25F, 1.0F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(48, 36).addBox(-3.0F, 10.25F, -0.5F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(48, 31).addBox(-3.0F, 10.25F, -2.0F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE), PartPose.offset(-5.0F, 0.5F, 0.0F));

        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, -1.5F, -2.0F, 4.0F, 12.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(27, 54).addBox(-1.0F, 10.25F, -2.0F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(23, 54).addBox(2.0F, 10.25F, 1.0F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(14, 54).addBox(2.0F, 10.25F, -0.5F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(52, 43).addBox(2.0F, 10.25F, -2.0F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE), PartPose.offset(5.0F, 0.5F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void prepareMobModel(LightLatexWolfOrganic p_102861_, float p_102862_, float p_102863_, float p_102864_) {
        this.prepareMobModel(animator, p_102861_, p_102862_, p_102863_, p_102864_);
    }

    public void setupHand() {
        animator.setupHand();
    }

    @Override
    public void setupAnim(@NotNull LightLatexWolfOrganic entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
    }

    public ModelPart getArm(HumanoidArm p_102852_) {
        return p_102852_ == HumanoidArm.LEFT ? this.LeftArm : this.RightArm;
    }

    public ModelPart getHead() {
        return this.Head;
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        RightLeg.render(poseStack, buffer, packedLight, packedOverlay);
        LeftLeg.render(poseStack, buffer, packedLight, packedOverlay);
        Head.render(poseStack, buffer, packedLight, packedOverlay);
        Torso.render(poseStack, buffer, packedLight, packedOverlay);
        RightArm.render(poseStack, buffer, packedLight, packedOverlay);
        LeftArm.render(poseStack, buffer, packedLight, packedOverlay);
    }

    @Override
    public LatexAnimator<LightLatexWolfOrganic, LightLatexWolfOrganicModel> getAnimator() {
        return animator;
    }
}
