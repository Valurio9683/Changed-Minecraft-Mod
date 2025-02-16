package net.ltxprogrammer.changed.client.renderer.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.ltxprogrammer.changed.Changed;
import net.ltxprogrammer.changed.client.renderer.animate.AnimatorPresets;
import net.ltxprogrammer.changed.client.renderer.animate.LatexAnimator;
import net.ltxprogrammer.changed.entity.beast.LatexWatermelonCat;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.HumanoidArm;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class LatexWatermelonCatModel extends LatexHumanoidModel<LatexWatermelonCat> implements LatexHumanoidModelInterface<LatexWatermelonCat, LatexWatermelonCatModel> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Changed.modResource("latex_watermelon_cat"), "main");
    private final ModelPart RightLeg;
    private final ModelPart LeftLeg;
    private final ModelPart RightArm;
    private final ModelPart LeftArm;
    private final ModelPart Head;
    private final ModelPart Torso;
    private final ModelPart Tail;
    private final LatexAnimator<LatexWatermelonCat, LatexWatermelonCatModel> animator;

    public LatexWatermelonCatModel(ModelPart root) {
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

        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(49, 55).addBox(-2.0F, 12.0F, -2.75F, 4.0F, 2.0F, 4.0F, CubeDeformation.NONE), PartPose.offset(-2.5F, 10.0F, 0.0F));

        PartDefinition RightUpperLeg_r1 = RightLeg.addOrReplaceChild("RightUpperLeg_r1", CubeListBuilder.create().texOffs(0, 47).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

        PartDefinition Toe_r1 = RightLeg.addOrReplaceChild("Toe_r1", CubeListBuilder.create().texOffs(32, 44).addBox(-2.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
                .texOffs(42, 42).addBox(-4.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
                .texOffs(42, 30).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.0F, 13.0F, -3.25F, -0.6109F, 0.0F, 0.0F));

        PartDefinition Toe_r2 = RightLeg.addOrReplaceChild("Toe_r2", CubeListBuilder.create().texOffs(0, 42).addBox(-4.0F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
                .texOffs(4, 42).addBox(-2.5F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
                .texOffs(12, 42).addBox(-1.0F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.0F, 16.0F, -1.75F, 0.0F, 0.0F, 0.0F));

        PartDefinition RightLowerLeg_r1 = RightLeg.addOrReplaceChild("RightLowerLeg_r1", CubeListBuilder.create().texOffs(26, 49).addBox(-2.0F, -7.5F, -1.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(0.0F, 14.25F, -1.25F, -0.5236F, 0.0F, 0.0F));

        PartDefinition RightMidLeg_r1 = RightLeg.addOrReplaceChild("RightMidLeg_r1", CubeListBuilder.create().texOffs(44, 12).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 4.25F, -1.5F, 0.5672F, 0.0F, 0.0F));

        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(54, 23).addBox(-2.0F, 12.0F, -2.75F, 4.0F, 2.0F, 4.0F, CubeDeformation.NONE), PartPose.offset(2.5F, 10.0F, 0.0F));

        PartDefinition LeftUpperLeg_r1 = LeftLeg.addOrReplaceChild("LeftUpperLeg_r1", CubeListBuilder.create().texOffs(46, 45).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

        PartDefinition Toe_r3 = LeftLeg.addOrReplaceChild("Toe_r3", CubeListBuilder.create().texOffs(4, 40).addBox(-2.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
                .texOffs(16, 38).addBox(-4.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
                .texOffs(41, 28).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.0F, 13.0F, -3.25F, -0.6109F, 0.0F, 0.0F));

        PartDefinition Toe_r4 = LeftLeg.addOrReplaceChild("Toe_r4", CubeListBuilder.create().texOffs(0, 40).addBox(-4.0F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
                .texOffs(12, 40).addBox(-2.5F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
                .texOffs(16, 40).addBox(-1.0F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.0F, 16.0F, -1.75F, 0.0F, 0.0F, 0.0F));

        PartDefinition LeftLowerLeg_r1 = LeftLeg.addOrReplaceChild("LeftLowerLeg_r1", CubeListBuilder.create().texOffs(48, 0).addBox(-2.0F, -7.5F, -1.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(0.0F, 14.25F, -1.25F, -0.5236F, 0.0F, 0.0F));

        PartDefinition LeftMidLeg_r1 = LeftLeg.addOrReplaceChild("LeftMidLeg_r1", CubeListBuilder.create().texOffs(42, 28).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 4.25F, -1.5F, 0.5672F, 0.0F, 0.0F));

        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 8.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(32, 19).addBox(-1.5F, 0.0F, -5.0F, 3.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(24, 0).addBox(-2.0F, -2.0F, -6.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offset(0.0F, -2.0F, 0.0F));

        PartDefinition leftear_r1 = Head.addOrReplaceChild("leftear_r1", CubeListBuilder.create().texOffs(82, 0).addBox(-6.25F, -33.5F, -15.5F, 2.0F, 5.0F, 3.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 26.0F, 0.0F, -0.3927F, 0.1745F, 0.2618F));

        PartDefinition rightear_r1 = Head.addOrReplaceChild("rightear_r1", CubeListBuilder.create().texOffs(81, 8).addBox(4.25F, -33.5F, -15.5F, 2.0F, 5.0F, 3.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 26.0F, 0.0F, -0.3927F, -0.1745F, -0.2618F));

        PartDefinition Snout_r1 = Head.addOrReplaceChild("Snout_r1", CubeListBuilder.create().texOffs(24, 45).addBox(-1.0F, -29.625F, -0.95F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.5F, 27.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

        PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(66, 10).addBox(1.0F, -12.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.48F, 0.3927F, 0.0F));

        PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(66, 16).addBox(-2.0F, -12.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.48F, -0.3927F, 0.0F));

        PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(64, 54).addBox(-6.55F, -5.65F, -4.625F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.0436F, -0.1309F, 0.0F));

        PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(65, 25).addBox(-6.0F, -6.0F, -1.9F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.1745F, 0.3054F, 0.0F));

        PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(65, 61).addBox(4.55F, -5.65F, -4.625F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.0436F, 0.1309F, 0.0F));

        PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(64, 33).addBox(4.0F, -6.0F, -1.9F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.1745F, -0.3054F, 0.0F));

        PartDefinition Hair = Head.addOrReplaceChild("Hair", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Base_r1 = Hair.addOrReplaceChild("Base_r1", CubeListBuilder.create().texOffs(59, 61).addBox(3.5F, -6.0F, -4.75F, 1.0F, 7.0F, 2.0F, CubeDeformation.NONE)
                .texOffs(0, 0).addBox(-4.5F, -6.0F, -4.75F, 2.0F, 7.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(20, 16).addBox(-4.5F, -8.0F, -4.75F, 9.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(60, 9).addBox(-4.0F, -8.75F, 3.75F, 2.0F, 11.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(26, 58).addBox(2.0F, -8.75F, 3.75F, 2.0F, 11.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(16, 48).addBox(-2.0F, -9.0F, 4.0F, 4.0F, 12.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(58, 29).addBox(3.75F, -4.0F, 0.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.001F))
                .texOffs(58, 38).addBox(-4.75F, -4.0F, 0.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.001F))
                .texOffs(32, 16).addBox(-5.0F, -8.0F, -4.0F, 1.0F, 4.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(32, 37).addBox(4.0F, -8.0F, -4.0F, 1.0F, 4.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(12, 39).addBox(-4.0F, -8.75F, -4.0F, 2.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(0, 38).addBox(2.0F, -8.75F, -4.0F, 2.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(42, 39).addBox(-4.0F, -0.75F, 2.0F, 8.0F, 1.0F, 2.0F, CubeDeformation.NONE)
                .texOffs(16, 20).addBox(-2.0F, -9.0F, -4.0F, 4.0F, 1.0F, 8.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        PartDefinition Torso = partdefinition.addOrReplaceChild("Torso", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 0.0F));

        PartDefinition WaistLower_r1 = Torso.addOrReplaceChild("WaistLower_r1", CubeListBuilder.create().texOffs(0, 67).addBox(-4.0F, -2.0F, -2.0F, 8.0F, 2.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(33, 66).addBox(-4.0F, -3.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.1F))
                .texOffs(0, 77).addBox(-4.0F, -8.0F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(-0.2F))
                .texOffs(0, 16).addBox(-4.0F, -12.0F, -2.0F, 8.0F, 5.0F, 4.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 13.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        PartDefinition Tail = Torso.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 11.5F, 0.0F));

        PartDefinition Base_r2 = Tail.addOrReplaceChild("Base_r2", CubeListBuilder.create().texOffs(0, 57).addBox(-1.5F, 6.35F, -3.075F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4835F, 0.0F, 0.0F));

        PartDefinition Base_r3 = Tail.addOrReplaceChild("Base_r3", CubeListBuilder.create().texOffs(37, 55).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 7.0F, 3.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1781F, 0.0F, 0.0F));

        PartDefinition NeckFluff = Torso.addOrReplaceChild("NeckFluff", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Base_r4 = NeckFluff.addOrReplaceChild("Base_r4", CubeListBuilder.create().texOffs(65, 51).addBox(3.75F, 0.0F, -3.0F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(25, 74).addBox(-2.75F, 0.0F, -3.0F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(0, 74).addBox(-2.0F, 0.0F, -3.25F, 6.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(22, 78).addBox(-2.5F, 0.0F, 1.5F, 7.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(69, 42).addBox(-1.0F, 0.0F, 1.75F, 4.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(31, 73).addBox(-2.0F, 2.0F, 1.5F, 6.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(12, 62).addBox(-2.0F, 0.0F, -3.0F, 6.0F, 3.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        PartDefinition Plantoids = Torso.addOrReplaceChild("Plantoids", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Center_r1 = Plantoids.addOrReplaceChild("Center_r1", CubeListBuilder.create().texOffs(36, 29).addBox(-1.0F, -11.5F, -2.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, 13.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        PartDefinition LeftPlantoid_r1 = Plantoids.addOrReplaceChild("LeftPlantoid_r1", CubeListBuilder.create().texOffs(24, 4).addBox(0.75F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.4F))
                .texOffs(20, 29).addBox(-3.75F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 3.0F, -2.0F, -0.1047F, 0.0F, 0.0F));

        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(32, 0).addBox(-3.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(32, 21).addBox(0.0F, 10.75F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
                .texOffs(35, 22).addBox(-3.0F, 10.75F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
                .texOffs(0, 38).addBox(-3.0F, 10.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
                .texOffs(4, 38).addBox(-3.0F, 10.75F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offset(-5.0F, 0.0F, 0.0F));

        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(24, 29).addBox(-1.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(0, 16).addBox(-1.0F, 10.75F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
                .texOffs(0, 18).addBox(2.0F, 10.75F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
                .texOffs(0, 28).addBox(2.0F, 10.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
                .texOffs(0, 30).addBox(2.0F, 10.75F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offset(5.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void prepareMobModel(LatexWatermelonCat p_102861_, float p_102862_, float p_102863_, float p_102864_) {
        this.prepareMobModel(animator, p_102861_, p_102862_, p_102863_, p_102864_);
    }

    public void setupHand() {
        animator.setupHand();
    }

    @Override
    public void setupAnim(@NotNull LatexWatermelonCat entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
    public LatexAnimator<LatexWatermelonCat, LatexWatermelonCatModel> getAnimator() {
        return animator;
    }

    public static class Remodel extends LatexHumanoidModel.LatexRemodel<LatexWatermelonCat, Remodel> {
        private final ModelPart RightLeg;
        private final ModelPart LeftLeg;
        private final ModelPart RightArm;
        private final ModelPart LeftArm;
        private final ModelPart Head;
        private final ModelPart Torso;
        private final ModelPart Tail;
        private final LatexAnimator<LatexWatermelonCat, Remodel> animator;

        public Remodel(ModelPart root) {
            super(root);
            this.RightLeg = root.getChild("RightLeg");
            this.LeftLeg = root.getChild("LeftLeg");
            this.Head = root.getChild("Head");
            this.Torso = root.getChild("Torso");
            this.Tail = Torso.getChild("Tail");
            this.RightArm = root.getChild("RightArm");
            this.LeftArm = root.getChild("LeftArm");
            animator = LatexAnimator.of(this).addPreset(AnimatorPresets.wolfLike(Head, Torso, LeftArm, RightArm, Tail, List.of(), LeftLeg, RightLeg)).hipOffset(0.0f);
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshdefinition = new MeshDefinition();
            PartDefinition partdefinition = meshdefinition.getRoot();

            PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, CubeDeformation.NONE)
                    .texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.2F))
                    .texOffs(24, 0).addBox(-2.0F, -3.0F, -6.0F, 4.0F, 2.0F, 2.0F, CubeDeformation.NONE)
                    .texOffs(39, 22).addBox(-0.5F, -3.1F, -6.05F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                    .texOffs(44, 0).addBox(-1.5F, -1.0F, -5.0F, 3.0F, 1.0F, 1.0F, CubeDeformation.NONE), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition RightEar = Head.addOrReplaceChild("RightEar", CubeListBuilder.create(), PartPose.offset(-6.0F, 24.0F, 0.0F));

            PartDefinition Base_r1 = RightEar.addOrReplaceChild("Base_r1", CubeListBuilder.create().texOffs(26, 70).addBox(0.0F, -2.0F, -0.5F, 2.0F, 3.0F, 3.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(2.0F, -32.0F, -0.5F, 0.0F, 0.0F, -0.2182F));

            PartDefinition LeftEar = Head.addOrReplaceChild("LeftEar", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition Base_r2 = LeftEar.addOrReplaceChild("Base_r2", CubeListBuilder.create().texOffs(16, 70).addBox(-2.0F, -2.0F, -0.5F, 2.0F, 3.0F, 3.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(4.0F, -32.0F, -0.5F, 0.0F, 0.0F, 0.2182F));

            PartDefinition HeadSpikes = Head.addOrReplaceChild("HeadSpikes", CubeListBuilder.create().texOffs(64, 0).addBox(4.7143F, -0.1429F, -3.7337F, 1.0F, 1.0F, 6.0F, CubeDeformation.NONE)
                    .texOffs(24, 16).addBox(-5.2857F, -0.1429F, -3.7337F, 1.0F, 1.0F, 6.0F, CubeDeformation.NONE), PartPose.offset(-0.2143F, -4.3571F, -0.7663F));

            PartDefinition head_r1 = HeadSpikes.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(0, 32).addBox(3.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, CubeDeformation.NONE)
                    .texOffs(24, 35).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(-1.2857F, -3.6429F, 2.7663F, -0.3491F, 0.0F, 0.0F));

            PartDefinition part_r1 = HeadSpikes.addOrReplaceChild("part_r1", CubeListBuilder.create().texOffs(32, 25).addBox(-3.0F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(5.7143F, 0.3571F, 2.2663F, 0.0F, 0.8727F, 0.0F));

            PartDefinition part_r2 = HeadSpikes.addOrReplaceChild("part_r2", CubeListBuilder.create().texOffs(24, 19).addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(5.7143F, 0.3571F, -3.7337F, 0.0F, 0.8727F, 0.0F));

            PartDefinition part_r3 = HeadSpikes.addOrReplaceChild("part_r3", CubeListBuilder.create().texOffs(24, 16).addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(-5.2857F, 0.3571F, -3.7337F, 0.0F, -0.8727F, 0.0F));

            PartDefinition part_r4 = HeadSpikes.addOrReplaceChild("part_r4", CubeListBuilder.create().texOffs(32, 23).addBox(0.0F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(-5.2857F, 0.3571F, 2.2663F, 0.0F, -0.8727F, 0.0F));

            PartDefinition Torso = partdefinition.addOrReplaceChild("Torso", CubeListBuilder.create().texOffs(0, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, CubeDeformation.NONE)
                    .texOffs(28, 28).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition Tail = Torso.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, 0.0F));

            PartDefinition lower_fur_r1 = Tail.addOrReplaceChild("lower_fur_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.4914F, -0.4983F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.2F))
                    .texOffs(0, 16).addBox(-0.5F, 0.4914F, -0.4983F, 2.0F, 6.0F, 2.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(-0.5F, 2.625F, 6.0F, 1.4835F, 0.0F, 0.0F));

            PartDefinition tail_fur_r1 = Tail.addOrReplaceChild("tail_fur_r1", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.2F))
                    .texOffs(8, 70).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 7.0F, 2.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(-0.5F, 0.5F, 0.0F, 1.1781F, 0.0F, 0.0F));

            PartDefinition Breasts = Torso.addOrReplaceChild("Breasts", CubeListBuilder.create().texOffs(64, 68).addBox(-4.25F, -2.25F, -1.0F, 4.0F, 4.0F, 2.0F, CubeDeformation.NONE)
                    .texOffs(68, 41).addBox(0.25F, -2.25F, -1.0F, 4.0F, 4.0F, 2.0F, CubeDeformation.NONE)
                    .texOffs(68, 28).addBox(0.25F, -2.25F, -1.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.2F))
                    .texOffs(32, 16).addBox(-4.25F, -2.25F, -1.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, 2.5F, -2.0F, -0.4363F, 0.0F, 0.0F));

            PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(20, 44).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, CubeDeformation.NONE)
                    .texOffs(32, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

            PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(36, 44).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, CubeDeformation.NONE)
                    .texOffs(44, 12).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(5.0F, 2.0F, 0.0F));

            PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-2.25F, 12.0F, 0.0F));

            PartDefinition leg_fur_r1 = RightLeg.addOrReplaceChild("leg_fur_r1", CubeListBuilder.create().texOffs(60, 8).addBox(-2.0F, -6.7987F, -2.9677F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.2F))
                    .texOffs(16, 60).addBox(-2.0F, -6.7987F, -2.9677F, 4.0F, 6.0F, 4.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 5.275F, 4.9F, 1.2217F, 0.0F, 0.0F));

            PartDefinition thigh_fur_r1 = RightLeg.addOrReplaceChild("thigh_fur_r1", CubeListBuilder.create().texOffs(48, 62).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.25F))
                    .texOffs(64, 58).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, -0.0873F, 0.0F, 0.0F));

            PartDefinition RightLower = RightLeg.addOrReplaceChild("RightLower", CubeListBuilder.create().texOffs(64, 48).addBox(-2.0F, 6.975F, -4.675F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.025F)), PartPose.offset(0.0F, 4.0F, 4.5F));

            PartDefinition leg_fur_r2 = RightLower.addOrReplaceChild("leg_fur_r2", CubeListBuilder.create().texOffs(52, 28).addBox(-2.0F, -0.225F, -3.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.225F))
                    .texOffs(52, 40).addBox(-2.0F, -0.225F, -3.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.15F, -1.0F, -0.0873F, 0.0F, 0.0F));

            PartDefinition RightLowerBeans = RightLower.addOrReplaceChild("RightLowerBeans", CubeListBuilder.create().texOffs(20, 32).addBox(1.0F, -13.025F, 0.325F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.075F))
                    .texOffs(24, 41).addBox(1.5F, -13.025F, -1.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.075F))
                    .texOffs(39, 26).addBox(0.225F, -13.025F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.075F))
                    .texOffs(44, 2).addBox(2.8F, -13.025F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.075F)), PartPose.offset(-2.0F, 20.0F, -3.2F));

            PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(2.25F, 12.0F, 0.0F));

            PartDefinition leg_fur_r3 = LeftLeg.addOrReplaceChild("leg_fur_r3", CubeListBuilder.create().texOffs(52, 52).addBox(-2.0F, -6.7987F, -2.9677F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.2F))
                    .texOffs(0, 60).addBox(-2.0F, -6.7987F, -2.9677F, 4.0F, 6.0F, 4.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 5.275F, 4.9F, 1.2217F, 0.0F, 0.0F));

            PartDefinition thigh_fur_r2 = LeftLeg.addOrReplaceChild("thigh_fur_r2", CubeListBuilder.create().texOffs(60, 18).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.25F))
                    .texOffs(32, 60).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, -0.0873F, 0.0F, 0.0F));

            PartDefinition LeftLower = LeftLeg.addOrReplaceChild("LeftLower", CubeListBuilder.create().texOffs(64, 36).addBox(-2.0F, 6.975F, -4.675F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.025F)), PartPose.offset(0.0F, 4.0F, 4.5F));

            PartDefinition leg_fur_r4 = LeftLower.addOrReplaceChild("leg_fur_r4", CubeListBuilder.create().texOffs(0, 48).addBox(-2.0F, -0.225F, -3.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.225F))
                    .texOffs(48, 0).addBox(-2.0F, -0.225F, -3.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.15F, -1.0F, -0.0873F, 0.0F, 0.0F));

            PartDefinition LeftLowerBeans2 = LeftLower.addOrReplaceChild("LeftLowerBeans2", CubeListBuilder.create().texOffs(24, 4).addBox(1.0F, -13.025F, 0.325F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.075F))
                    .texOffs(39, 24).addBox(1.5F, -13.025F, -1.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.075F))
                    .texOffs(24, 39).addBox(0.225F, -13.025F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.075F))
                    .texOffs(32, 44).addBox(2.8F, -13.025F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.075F)), PartPose.offset(-2.0F, 20.0F, -3.2F));

            return LayerDefinition.create(meshdefinition, 128, 128);
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
        public LatexAnimator<LatexWatermelonCat, Remodel> getAnimator() {
            return animator;
        }
    }
}
