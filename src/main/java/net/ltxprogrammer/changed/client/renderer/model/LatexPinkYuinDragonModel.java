package net.ltxprogrammer.changed.client.renderer.model;
// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.ltxprogrammer.changed.Changed;
import net.ltxprogrammer.changed.client.renderer.animate.AnimatorPresets;
import net.ltxprogrammer.changed.client.renderer.animate.LatexAnimator;
import net.ltxprogrammer.changed.entity.beast.LatexPinkYuinDragon;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@OnlyIn(Dist.CLIENT)
public class LatexPinkYuinDragonModel extends LatexHumanoidModel<LatexPinkYuinDragon> implements LatexHumanoidModelInterface<LatexPinkYuinDragon, LatexPinkYuinDragonModel> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Changed.modResource("latex_pink_yuin_dragon"), "main");
    private final ModelPart RightLeg;
    private final ModelPart LeftLeg;
    private final ModelPart RightArm;
    private final ModelPart LeftArm;
    private final ModelPart Head;
    private final ModelPart Torso;
    private final ModelPart Tail;
    private final ModelPart RightWing;
    private final ModelPart LeftWing;
    private final LatexAnimator<LatexPinkYuinDragon, LatexPinkYuinDragonModel> animator;

    public LatexPinkYuinDragonModel(ModelPart root) {
        super(root);
        this.RightLeg = root.getChild("RightLeg");
        this.LeftLeg = root.getChild("LeftLeg");
        this.Head = root.getChild("Head");
        this.Torso = root.getChild("Torso");
        this.Tail = Torso.getChild("Tail");
        this.RightArm = root.getChild("RightArm");
        this.LeftArm = root.getChild("LeftArm");
        this.RightWing = Torso.getChild("RightWing");
        this.LeftWing = Torso.getChild("LeftWing");

        ModelPart leftWingRoot = LeftWing.getChild("leftWingRoot");
        ModelPart rightWingRoot = RightWing.getChild("rightWingRoot");
        animator = LatexAnimator.of(this).addPreset(AnimatorPresets.legacyDragonLike(Head, Torso, LeftArm, RightArm, Tail, List.of(), LeftLeg, RightLeg,
                leftWingRoot, leftWingRoot.getChild("leftSecondaries"), leftWingRoot.getChild("leftSecondaries").getChild("leftTertiaries"),
                rightWingRoot, rightWingRoot.getChild("rightSecondaries"), rightWingRoot.getChild("rightSecondaries").getChild("rightTertiaries")
        )).hipOffset(-2.0f);
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(30, 55).addBox(-2.0F, 12.0F, -2.75F, 4.0F, 2.0F, 4.0F, CubeDeformation.NONE), PartPose.offset(-2.5F, 10.0F, 0.0F));

        PartDefinition Toe_r1 = RightLeg.addOrReplaceChild("Toe_r1", CubeListBuilder.create().texOffs(36, 17).addBox(-2.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(36, 19).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(51, 1).addBox(-4.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(2.0F, 13.0F, -3.25F, -0.6109F, 0.0F, 0.0F));

        PartDefinition Toe_r2 = RightLeg.addOrReplaceChild("Toe_r2", CubeListBuilder.create().texOffs(28, 44).addBox(-1.0F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(44, 45).addBox(-2.5F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(28, 47).addBox(-4.0F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(2.0F, 16.0F, -1.75F, 0.0F, 0.0F, 0.0F));

        PartDefinition RightLowerLeg_r1 = RightLeg.addOrReplaceChild("RightLowerLeg_r1", CubeListBuilder.create().texOffs(52, 0).addBox(-2.0F, -7.5F, -1.0F, 4.0F, 6.0F, 3.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 14.25F, -1.25F, -0.5236F, 0.0F, 0.0F));

        PartDefinition RightMidLeg_r1 = RightLeg.addOrReplaceChild("RightMidLeg_r1", CubeListBuilder.create().texOffs(44, 14).addBox(-1.99F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 4.25F, -1.5F, 0.5672F, 0.0F, 0.0F));

        PartDefinition RightUpperLeg_r1 = RightLeg.addOrReplaceChild("RightUpperLeg_r1", CubeListBuilder.create().texOffs(44, 45).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(14, 55).addBox(-2.0F, 12.0F, -2.75F, 4.0F, 2.0F, 4.0F, CubeDeformation.NONE), PartPose.offset(2.5F, 10.0F, 0.0F));

        PartDefinition Toe_r3 = LeftLeg.addOrReplaceChild("Toe_r3", CubeListBuilder.create().texOffs(14, 55).addBox(-2.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(30, 55).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(14, 57).addBox(-4.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(2.0F, 13.0F, -3.25F, -0.6109F, 0.0F, 0.0F));

        PartDefinition Toe_r4 = LeftLeg.addOrReplaceChild("Toe_r4", CubeListBuilder.create().texOffs(46, 55).addBox(-1.0F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(56, 14).addBox(-2.5F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(56, 16).addBox(-4.0F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(2.0F, 16.0F, -1.75F, 0.0F, 0.0F, 0.0F));

        PartDefinition LeftLowerLeg_r1 = LeftLeg.addOrReplaceChild("LeftLowerLeg_r1", CubeListBuilder.create().texOffs(0, 52).addBox(-2.0F, -7.5F, -1.0F, 4.0F, 6.0F, 3.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 14.25F, -1.25F, -0.5236F, 0.0F, 0.0F));

        PartDefinition LeftMidLeg_r1 = LeftLeg.addOrReplaceChild("LeftMidLeg_r1", CubeListBuilder.create().texOffs(12, 44).addBox(-2.01F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 4.25F, -1.5F, 0.5672F, 0.0F, 0.0F));

        PartDefinition LeftUpperLeg_r1 = LeftLeg.addOrReplaceChild("LeftUpperLeg_r1", CubeListBuilder.create().texOffs(28, 45).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.5F, -4.0F, 8.0F, 8.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(12, 32).addBox(-2.0F, -2.5F, -6.0F, 4.0F, 2.0F, 2.0F, CubeDeformation.NONE)
                .texOffs(44, 2).addBox(-1.5F, -0.5F, -5.0F, 3.0F, 1.0F, 1.0F, CubeDeformation.NONE), PartPose.offset(0.0F, -1.5F, 0.0F));

        PartDefinition lefthorn_r1 = Head.addOrReplaceChild("lefthorn_r1", CubeListBuilder.create().texOffs(62, 25).addBox(1.5F, -24.85F, -24.25F, 2.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(28, 61).addBox(1.5F, -27.0F, -25.25F, 2.0F, 5.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 25.5F, 0.0F, -0.7854F, -0.0873F, 0.0F));

        PartDefinition righthorn_r1 = Head.addOrReplaceChild("righthorn_r1", CubeListBuilder.create().texOffs(56, 46).addBox(-3.5F, -24.85F, -24.25F, 2.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(34, 61).addBox(-3.5F, -27.0F, -25.25F, 2.0F, 5.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 25.5F, 0.0F, -0.7854F, 0.0873F, 0.0F));

        PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(16, 36).addBox(-1.9F, -5.25F, -1.5F, 1.0F, 1.0F, 2.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.1745F, -0.48F, -0.8727F));

        PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(24, 44).addBox(-2.4F, -4.25F, -1.25F, 1.0F, 1.0F, 2.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.1745F, -0.3927F, -0.8727F));

        PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(62, 17).addBox(0.9F, -5.25F, -1.5F, 1.0F, 1.0F, 2.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.1745F, 0.48F, 0.8727F));

        PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(40, 45).addBox(1.4F, -4.25F, -1.25F, 1.0F, 1.0F, 2.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.1745F, 0.3927F, 0.8727F));

        PartDefinition Hair = Head.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(24, 8).addBox(-2.0F, -34.9F, -4.0F, 4.0F, 1.0F, 8.0F, CubeDeformation.NONE)
                .texOffs(24, 0).addBox(-4.0F, -34.5F, -3.5F, 8.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(8, 61).addBox(2.0F, -34.75F, 0.0F, 2.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(16, 33).addBox(2.5F, -34.0F, -4.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.025F))
                .texOffs(40, 61).addBox(3.5F, -31.0F, -3.25F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.025F))
                .texOffs(40, 5).addBox(-4.5F, -31.0F, -3.25F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.025F))
                .texOffs(56, 44).addBox(-3.5F, -33.0F, -4.25F, 7.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(24, 0).addBox(3.5F, -34.0F, -4.5F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(0, 16).addBox(-4.5F, -34.0F, -4.5F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(55, 50).addBox(2.5F, -31.0F, -1.0F, 2.0F, 2.0F, 5.0F, CubeDeformation.NONE)
                .texOffs(46, 55).addBox(-4.5F, -31.0F, -1.0F, 2.0F, 2.0F, 5.0F, CubeDeformation.NONE)
                .texOffs(32, 25).addBox(-4.5F, -34.0F, -4.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.025F))
                .texOffs(60, 20).addBox(-4.0F, -34.75F, 0.0F, 2.0F, 1.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(24, 5).addBox(-4.0F, -34.0F, -4.5F, 8.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(52, 9).addBox(-1.0F, -32.25F, -4.25F, 2.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(44, 25).addBox(-4.0F, -34.0F, 4.0F, 8.0F, 6.0F, 1.0F, CubeDeformation.NONE), PartPose.offset(0.0F, 26.5F, 0.0F));

        PartDefinition LeftEar = Hair.addOrReplaceChild("LeftEar", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.25F, -9.35F, -1.0F, 0.0F, 0.0F, 0.6109F));

        PartDefinition cube_r1 = LeftEar.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(28, 36).addBox(-11.5F, -28.25F, -0.75F, 4.0F, 1.0F, 3.0F, CubeDeformation.NONE)
                .texOffs(0, 5).addBox(-11.5F, -28.25F, -1.2F, 3.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(26, 55).addBox(-7.75F, -28.25F, -0.25F, 1.0F, 1.0F, 2.0F, CubeDeformation.NONE)
                .texOffs(20, 17).addBox(-11.5F, -28.25F, 1.7F, 3.0F, 1.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));

        PartDefinition RightEar = Hair.addOrReplaceChild("RightEar", CubeListBuilder.create(), PartPose.offsetAndRotation(16.25F, -9.35F, -1.0F, 0.0F, 0.0F, -0.6109F));

        PartDefinition cube_r2 = RightEar.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(54, 40).addBox(7.5F, -28.25F, -0.75F, 4.0F, 1.0F, 3.0F, CubeDeformation.NONE)
                .texOffs(40, 14).addBox(8.5F, -28.25F, 1.7F, 3.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(42, 55).addBox(6.75F, -28.25F, -0.25F, 1.0F, 1.0F, 2.0F, CubeDeformation.NONE)
                .texOffs(44, 0).addBox(8.5F, -28.25F, -1.2F, 3.0F, 1.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition Torso = partdefinition.addOrReplaceChild("Torso", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, 0.5F, -2.0F, 8.0F, 12.0F, 4.0F, CubeDeformation.NONE), PartPose.offset(0.0F, -1.5F, 0.0F));

        PartDefinition LeftWing = Torso.addOrReplaceChild("LeftWing", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 5.5F, 2.0F, 0.0F, -0.48F, 0.0F));

        PartDefinition leftWingRoot = LeftWing.addOrReplaceChild("leftWingRoot", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r3 = leftWingRoot.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(60, 12).addBox(18.975F, -4.475F, 1.65F, 7.0F, 5.0F, 0.0F, CubeDeformation.NONE)
                .texOffs(60, 12).addBox(18.975F, -4.475F, 1.7F, 7.0F, 5.0F, 0.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(-2.0F, 20.0F, -2.0F, 0.0F, 0.0F, -1.2654F));

        PartDefinition cube_r4 = leftWingRoot.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(58, 9).addBox(19.075F, -12.7F, 1.2F, 6.0F, 2.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(-2.0F, 20.0F, -2.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition cube_r5 = leftWingRoot.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(63, 0).addBox(7.775F, -19.75F, 1.2F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, 20.0F, -2.0F, 0.0F, 0.0F, -0.3491F));

        PartDefinition leftSecondaries = leftWingRoot.addOrReplaceChild("leftSecondaries", CubeListBuilder.create().texOffs(0, 61).addBox(-0.8F, -0.475F, -0.3F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(7.3F, -7.0F, -0.5F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r6 = leftSecondaries.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(24, 61).addBox(-2.025F, -22.55F, 1.2F, 1.0F, 6.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(-9.3F, 27.0F, -1.5F, 0.0F, 0.0F, 0.48F));

        PartDefinition cube_r7 = leftSecondaries.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(36, 67).addBox(15.525F, -13.85F, 1.648F, 9.0F, 6.0F, 0.0F, CubeDeformation.NONE)
                .texOffs(36, 67).addBox(15.525F, -13.85F, 1.702F, 9.0F, 6.0F, 0.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(-9.3F, 27.0F, -1.5F, 0.0F, 0.0F, -0.7418F));

        PartDefinition cube_r8 = leftSecondaries.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(64, 50).addBox(13.4F, 10.625F, 1.651F, 10.0F, 5.0F, 0.0F, CubeDeformation.NONE)
                .texOffs(64, 50).addBox(13.4F, 10.625F, 1.699F, 10.0F, 5.0F, 0.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(-9.3F, 27.0F, -1.5F, 0.0F, 0.0F, -1.8326F));

        PartDefinition leftTertiaries = leftSecondaries.addOrReplaceChild("leftTertiaries", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9599F));

        PartDefinition cube_r9 = leftTertiaries.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(8, 66).addBox(-3.3F, -22.5F, 1.2F, 1.0F, 7.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(-9.0F, 27.0F, -1.5F, 0.0F, 0.0F, 0.5236F));

        PartDefinition cube_r10 = leftTertiaries.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(16, 68).addBox(16.125F, -10.525F, 1.649F, 10.0F, 5.0F, 0.0F, CubeDeformation.NONE)
                .texOffs(16, 68).addBox(16.125F, -10.525F, 1.701F, 10.0F, 5.0F, 0.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(-9.0F, 27.0F, -1.5F, 0.0F, 0.0F, -0.8727F));

        PartDefinition cube_r11 = leftTertiaries.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(4, 69).addBox(9.15F, -26.2F, 1.2F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-9.0F, 27.0F, -1.5F, 0.0F, 0.0F, -0.0436F));

        PartDefinition RightWing = Torso.addOrReplaceChild("RightWing", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 5.5F, 2.0F, 0.0F, 0.48F, 0.0F));

        PartDefinition rightWingRoot = RightWing.addOrReplaceChild("rightWingRoot", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r12 = rightWingRoot.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(68, 17).addBox(-25.975F, -4.475F, 1.65F, 7.0F, 5.0F, 0.0F, CubeDeformation.NONE)
                .texOffs(68, 17).addBox(-25.975F, -4.475F, 1.7F, 7.0F, 5.0F, 0.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(2.0F, 20.0F, -2.0F, 0.0F, 0.0F, 1.2654F));

        PartDefinition cube_r13 = rightWingRoot.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(66, 6).addBox(-25.075F, -12.7F, 1.2F, 6.0F, 2.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(2.0F, 20.0F, -2.0F, 0.0F, 0.0F, 0.7854F));

        PartDefinition cube_r14 = rightWingRoot.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(66, 3).addBox(-12.775F, -19.75F, 1.2F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, 20.0F, -2.0F, 0.0F, 0.0F, 0.3491F));

        PartDefinition rightSecondaries = rightWingRoot.addOrReplaceChild("rightSecondaries", CubeListBuilder.create().texOffs(4, 61).addBox(-0.2F, -0.475F, -0.3F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-7.3F, -7.0F, -0.5F, 0.0F, 0.0F, 0.5236F));

        PartDefinition cube_r15 = rightSecondaries.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(20, 61).addBox(1.025F, -22.55F, 1.2F, 1.0F, 6.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(9.3F, 27.0F, -1.5F, 0.0F, 0.0F, -0.48F));

        PartDefinition cube_r16 = rightSecondaries.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(74, 26).addBox(-23.4F, 10.625F, 1.651F, 10.0F, 5.0F, 0.0F, CubeDeformation.NONE)
                .texOffs(74, 26).addBox(-23.4F, 10.625F, 1.699F, 10.0F, 5.0F, 0.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(9.3F, 27.0F, -1.5F, 0.0F, 0.0F, 1.8326F));

        PartDefinition cube_r17 = rightSecondaries.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(68, 38).addBox(-24.525F, -13.85F, 1.648F, 9.0F, 6.0F, 0.0F, CubeDeformation.NONE)
                .texOffs(68, 38).addBox(-24.525F, -13.85F, 1.702F, 9.0F, 6.0F, 0.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(9.3F, 27.0F, -1.5F, 0.0F, 0.0F, 0.7418F));

        PartDefinition rightTertiaries = rightSecondaries.addOrReplaceChild("rightTertiaries", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.9599F));

        PartDefinition cube_r18 = rightTertiaries.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(12, 66).addBox(2.3F, -22.5F, 1.2F, 1.0F, 7.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(9.0F, 27.0F, -1.5F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r19 = rightTertiaries.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 69).addBox(-10.15F, -26.2F, 1.2F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(9.0F, 27.0F, -1.5F, 0.0F, 0.0F, 0.0436F));

        PartDefinition cube_r20 = rightTertiaries.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(74, 31).addBox(-26.125F, -10.525F, 1.649F, 10.0F, 5.0F, 0.0F, CubeDeformation.NONE)
                .texOffs(74, 31).addBox(-26.125F, -10.525F, 1.701F, 10.0F, 5.0F, 0.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(9.0F, 27.0F, -1.5F, 0.0F, 0.0F, 0.8727F));

        PartDefinition Tail = Torso.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 11.5F, 0.0F));

        PartDefinition Base_r1 = Tail.addOrReplaceChild("Base_r1", CubeListBuilder.create().texOffs(60, 28).addBox(-1.0F, -10.35F, 13.925F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, 14.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

        PartDefinition Base_r2 = Tail.addOrReplaceChild("Base_r2", CubeListBuilder.create().texOffs(36, 36).addBox(-1.5F, -13.2F, 6.9F, 3.0F, 3.0F, 6.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 14.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

        PartDefinition Base_r3 = Tail.addOrReplaceChild("Base_r3", CubeListBuilder.create().texOffs(40, 5).addBox(-1.5F, -1.375F, -2.6983F, 3.0F, 3.0F, 6.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(0.0F, 2.0F, 6.0F, -0.3927F, 0.0F, 0.0F));

        PartDefinition Base_r4 = Tail.addOrReplaceChild("Base_r4", CubeListBuilder.create().texOffs(48, 32).addBox(-2.0F, -2.8F, 0.4F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(24, 17).addBox(-3.0F, -1.5F, -2.0F, 4.0F, 12.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(8, 61).addBox(0.0F, 10.25F, -2.0F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(60, 34).addBox(-3.0F, 10.25F, 1.0F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(55, 57).addBox(-3.0F, 10.25F, -0.5F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(47, 57).addBox(-3.0F, 10.25F, -2.0F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE), PartPose.offset(-5.0F, 0.5F, 0.0F));

        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, -1.5F, -2.0F, 4.0F, 12.0F, 4.0F, CubeDeformation.NONE)
                .texOffs(62, 46).addBox(-1.0F, 10.25F, -2.0F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(46, 62).addBox(2.0F, 10.25F, 1.0F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(61, 48).addBox(2.0F, 10.25F, -0.5F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
                .texOffs(16, 61).addBox(2.0F, 10.25F, -2.0F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE), PartPose.offset(5.0F, 0.5F, 0.0F));

        return LayerDefinition.create(meshdefinition, 96, 96);
    }

    @Override
    public void prepareMobModel(LatexPinkYuinDragon p_102861_, float p_102862_, float p_102863_, float p_102864_) {
        this.prepareMobModel(animator, p_102861_, p_102862_, p_102863_, p_102864_);
    }


    public void setupHand() {
        animator.setupHand();
    }


    @Override
    public void setupAnim(@NotNull LatexPinkYuinDragon entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
    public LatexAnimator<LatexPinkYuinDragon, LatexPinkYuinDragonModel> getAnimator() {
        return animator;
    }
}