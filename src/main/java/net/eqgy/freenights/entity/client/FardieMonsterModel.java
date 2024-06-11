package net.eqgy.freenights.entity.client;// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.eqgy.freenights.entity.animations.ModAnimationDefinitions;
import net.eqgy.freenights.entity.custom.FardieMonsterEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
//import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.*;

public class FardieMonsterModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "fardiemonster"), "main");
	private final ModelPart fardiemonster;
	private final ModelPart legs;
	private final ModelPart rightleg;
	private final ModelPart leftleg;
	private final ModelPart body;
	private final ModelPart ribs;
	private final ModelPart head;
	private final ModelPart neck;
	private final ModelPart heart;
	private final ModelPart arms;
	private final ModelPart left;
	private final ModelPart shoulder;
	private final ModelPart arm;
	private final ModelPart right;
	private final ModelPart belowelbow;
	private final ModelPart hand;
	private final ModelPart fingers;
	private final ModelPart pinky;
	private final ModelPart middle;
	private final ModelPart pointer;

	public FardieMonsterModel(ModelPart root) {
		this.fardiemonster = root.getChild("fardiemonster");
		this.legs = fardiemonster.getChild("legs");
		this.rightleg = legs.getChild("rightleg");
		this.leftleg = legs.getChild("leftleg");
		this.body = fardiemonster.getChild("body");
		this.ribs = body.getChild("ribs");
		this.head = fardiemonster.getChild("head");
		this.neck = fardiemonster.getChild("neck");
		this.heart = fardiemonster.getChild("heart");
		this.arms = fardiemonster.getChild("arms");
		this.left = arms.getChild("left");
		this.shoulder = left.getChild("shoulder");
		this.arm = left.getChild("arm");
		this.right = arms.getChild("right");
		this.belowelbow = right.getChild("belowelbow");
		this.hand = belowelbow.getChild("hand");
		this.fingers = hand.getChild("fingers");
		this.pinky = fingers.getChild("pinky");
		this.middle = fingers.getChild("middle");
		this.pointer = fingers.getChild("pointer");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fardiemonster = partdefinition.addOrReplaceChild("fardiemonster", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -30.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition legs = fardiemonster.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(-21.0F, 27.0F, 4.0F));

		PartDefinition rightleg = legs.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(57, 561).addBox(-5.0F, 0.0F, -1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(190, 415).addBox(-10.0F, -40.0F, -26.0F, 12.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(77, 537).addBox(-7.0F, -22.0F, -8.0F, 6.0F, 14.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 537).addBox(-9.0F, -1.0F, -5.0F, 11.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(166, 561).addBox(-8.0F, 0.0F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(268, 415).mirror().addBox(-11.0F, -25.0F, -15.0F, 9.0F, 15.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(217, 561).addBox(-11.0F, 0.0F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(100, 165).mirror().addBox(-15.0F, -28.0F, -19.0F, 20.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 561).addBox(3.0F, -1.0F, 0.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(158, 548).mirror().addBox(2.0F, -2.0F, -5.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(138, 110).mirror().addBox(-13.0F, -36.0F, -29.0F, 15.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 314).mirror().addBox(-12.0F, -10.0F, -23.0F, 13.0F, 9.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(201, 110).addBox(-12.0F, -36.0F, -29.0F, 14.0F, 16.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(49, 415).mirror().addBox(-9.0F, -4.0F, -16.0F, 12.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(137, 537).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 545).mirror().addBox(-5.0F, -3.0F, -20.0F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(6.0F, 26.0F, 15.0F));

		PartDefinition leftleg = legs.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(0, 537).mirror().addBox(-5.0F, 30.0F, 14.0F, 11.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(138, 110).addBox(-5.0F, -5.0F, -10.0F, 15.0F, 16.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(100, 165).addBox(-8.0F, 3.0F, 0.0F, 20.0F, 18.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(217, 561).mirror().addBox(6.0F, 31.0F, 16.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(137, 537).mirror().addBox(-3.0F, 31.0F, 18.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 561).mirror().addBox(-8.0F, 30.0F, 19.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 561).mirror().addBox(0.0F, 31.0F, 18.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(166, 561).mirror().addBox(3.0F, 31.0F, 18.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 537).mirror().addBox(-2.0F, 9.0F, 11.0F, 6.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(190, 415).mirror().addBox(-5.0F, -9.0F, -7.0F, 12.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(158, 548).addBox(-9.0F, 29.0F, 14.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(201, 110).mirror().addBox(-5.0F, -5.0F, -10.0F, 14.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 545).addBox(-6.0F, 28.0F, -1.0F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(49, 415).addBox(-6.0F, 27.0F, 3.0F, 12.0F, 5.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(57, 314).addBox(-4.0F, 21.0F, -4.0F, 13.0F, 9.0F, 15.0F, new CubeDeformation(0.0F))
				.texOffs(268, 415).addBox(-1.0F, 6.0F, 4.0F, 9.0F, 15.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(39.0F, -5.0F, -4.0F));

		PartDefinition body = fardiemonster.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(10.0F, -2.0F, -8.0F, 5.0F, 45.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 468).mirror().addBox(11.0F, 5.0F, 9.0F, 3.0F, 36.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 506).addBox(15.0F, 11.0F, 5.0F, 3.0F, 27.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(253, 0).addBox(-10.0F, -7.0F, -8.0F, 21.0F, 9.0F, 19.0F, new CubeDeformation(0.0F))
				.texOffs(121, 506).addBox(-18.0F, 11.0F, 5.0F, 2.0F, 27.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 165).addBox(-10.0F, -2.0F, -8.0F, 10.0F, 45.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(0, 375).addBox(-1.0F, 46.0F, -8.0F, 9.0F, 1.0F, 17.0F, new CubeDeformation(0.0F))
				.texOffs(98, 375).addBox(-17.0F, 12.0F, -6.0F, 2.0F, 26.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(0, 375).mirror().addBox(-8.0F, 46.0F, -8.0F, 9.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(219, 375).addBox(16.0F, 12.0F, -6.0F, 1.0F, 26.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(0, 165).mirror().addBox(0.0F, -2.0F, -8.0F, 10.0F, 45.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(179, 547).mirror().addBox(-12.0F, 39.0F, 9.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 47).mirror().addBox(-15.0F, -19.0F, -9.0F, 15.0F, 17.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(119, 468).mirror().addBox(-11.0F, 28.0F, 9.0F, 11.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(93, 439).mirror().addBox(-12.0F, 34.0F, 9.0F, 12.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(253, 0).mirror().addBox(-11.0F, -7.0F, -8.0F, 21.0F, 9.0F, 19.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(157, 47).mirror().addBox(0.0F, 40.0F, -8.0F, 14.0F, 6.0F, 22.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 47).addBox(0.0F, -19.0F, -9.0F, 15.0F, 17.0F, 18.0F, new CubeDeformation(0.0F))
				.texOffs(141, 561).mirror().addBox(-11.0F, 2.0F, 9.0F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(119, 537).mirror().addBox(10.0F, 22.0F, 9.0F, 2.0F, 21.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 47).addBox(-15.0F, -2.0F, -8.0F, 5.0F, 45.0F, 17.0F, new CubeDeformation(0.0F))
				.texOffs(98, 415).mirror().addBox(0.0F, 24.0F, 0.0F, 11.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(119, 468).addBox(0.0F, 28.0F, 9.0F, 11.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(93, 439).addBox(0.0F, 34.0F, 9.0F, 12.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(179, 547).addBox(7.0F, 39.0F, 9.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(119, 490).mirror().addBox(-12.0F, 41.0F, 9.0F, 11.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 561).mirror().addBox(-12.0F, 40.0F, 9.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 261).mirror().addBox(0.0F, -7.0F, -10.0F, 13.0F, 50.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(225, 572).mirror().addBox(9.0F, 3.0F, 9.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(119, 537).addBox(-12.0F, 22.0F, 9.0F, 2.0F, 21.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(141, 561).addBox(0.0F, 2.0F, 9.0F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(225, 572).addBox(-12.0F, 3.0F, 9.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 561).addBox(8.0F, 40.0F, 9.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(119, 490).addBox(1.0F, 41.0F, 9.0F, 11.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(98, 415).addBox(-11.0F, 24.0F, 0.0F, 11.0F, 4.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(44, 468).addBox(-14.0F, 5.0F, 9.0F, 3.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(157, 47).addBox(-14.0F, 40.0F, -8.0F, 14.0F, 6.0F, 22.0F, new CubeDeformation(0.0F))
				.texOffs(0, 261).addBox(-13.0F, -7.0F, -10.0F, 13.0F, 50.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 506).mirror().addBox(-18.0F, 11.0F, 5.0F, 3.0F, 27.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(121, 506).mirror().addBox(16.0F, 11.0F, 5.0F, 2.0F, 27.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(98, 375).mirror().addBox(15.0F, 12.0F, -6.0F, 2.0F, 26.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(219, 375).mirror().addBox(-17.0F, 12.0F, -6.0F, 1.0F, 26.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -5.0F, 0.0F));

		PartDefinition ribs = body.addOrReplaceChild("ribs", CubeListBuilder.create().texOffs(13, 572).mirror().addBox(4.0F, -1.0F, 9.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(128, 572).mirror().addBox(-4.0F, 3.0F, 9.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 572).mirror().addBox(-12.0F, 3.0F, 9.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(65, 572).mirror().addBox(-8.0F, 4.0F, 10.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(172, 572).mirror().addBox(8.0F, -2.0F, 8.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(161, 572).mirror().addBox(1.0F, -1.0F, 8.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(161, 572).addBox(-4.0F, -1.0F, 8.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(172, 572).addBox(-11.0F, -2.0F, 8.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(65, 572).addBox(4.0F, 4.0F, 10.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(78, 572).addBox(8.0F, 3.0F, 9.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(128, 572).addBox(1.0F, 3.0F, 9.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(13, 572).addBox(-8.0F, -1.0F, 9.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(205, 572).mirror().addBox(10.0F, 9.0F, 9.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(262, 566).mirror().addBox(5.0F, 10.0F, 10.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(104, 572).mirror().addBox(1.0F, 9.0F, 9.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(262, 566).addBox(-10.0F, 10.0F, 10.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(205, 572).addBox(-13.0F, 9.0F, 9.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(104, 572).addBox(-5.0F, 9.0F, 9.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.0F, 0.0F));

		PartDefinition head = fardiemonster.addOrReplaceChild("head", CubeListBuilder.create().texOffs(53, 375).addBox(-9.0F, -19.0F, 12.0F, 18.0F, 21.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(53, 348).addBox(-8.0F, -13.0F, 15.0F, 16.0F, 16.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(302, 414).addBox(-6.0F, -10.0F, 23.0F, 12.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(302, 414).addBox(-6.0F, -10.0F, 23.0F, 12.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(53, 468).addBox(-4.0F, -1.0F, 23.0F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-10.0F, -20.0F, -11.0F, 20.0F, 23.0F, 23.0F, new CubeDeformation(0.0F))
				.texOffs(27, 439).addBox(11.0F, -21.0F, -7.0F, 2.0F, 17.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(157, 220).addBox(-12.0F, -18.0F, -9.0F, 2.0F, 21.0F, 19.0F, new CubeDeformation(0.0F))
				.texOffs(186, 275).addBox(-15.0F, -24.0F, -1.0F, 7.0F, 9.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(27, 439).mirror().addBox(-13.0F, -21.0F, -7.0F, 2.0F, 17.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(157, 220).mirror().addBox(10.0F, -18.0F, -9.0F, 2.0F, 21.0F, 19.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(186, 275).mirror().addBox(8.0F, -24.0F, -1.0F, 7.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -36.0F, 0.0F));

		PartDefinition neck = fardiemonster.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(0, 110).addBox(-10.0F, 1.0F, -9.0F, 19.0F, 12.0F, 15.0F, new CubeDeformation(0.0F))
				.texOffs(0, 110).mirror().addBox(-9.0F, 1.0F, -9.0F, 19.0F, 12.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 110).addBox(0.0F, 1.0F, -9.0F, 10.0F, 12.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -36.0F, 0.0F));

		PartDefinition heart = fardiemonster.addOrReplaceChild("heart", CubeListBuilder.create().texOffs(38, 561).addBox(-5.0F, -3.0F, -1.0F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(234, 561).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(277, 561).addBox(-2.0F, -5.0F, -1.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(249, 561).addBox(1.0F, -6.0F, -1.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(96, 537).addBox(1.0F, -7.0F, -8.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 9.0F, 3.0F));

		PartDefinition arms = fardiemonster.addOrReplaceChild("arms", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left = arms.addOrReplaceChild("left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition shoulder = left.addOrReplaceChild("shoulder", CubeListBuilder.create().texOffs(129, 375).addBox(2.0F, -17.0F, -14.0F, 15.0F, 17.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(255, 314).addBox(11.0F, -16.0F, -10.0F, 11.0F, 11.0F, 15.0F, new CubeDeformation(0.0F))
				.texOffs(0, 220).addBox(6.0F, -19.0F, -13.0F, 13.0F, 14.0F, 15.0F, new CubeDeformation(0.0F))
				.texOffs(227, 439).addBox(-2.0F, -11.0F, -13.0F, 11.0F, 22.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(257, 348).addBox(11.0F, -10.0F, -7.0F, 11.0F, 10.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -10.0F, 2.0F));

		PartDefinition arm = left.addOrReplaceChild("arm", CubeListBuilder.create().texOffs(214, 165).addBox(9.0F, -10.0F, -8.0F, 11.0F, 20.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -5.0F, 2.0F));

		PartDefinition cube_r1 = arm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(252, 439).addBox(7.0F, 0.0F, 23.0F, 10.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, 13.0F, 14.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r2 = arm.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(200, 220).addBox(9.0F, -1.0F, 0.0F, 11.0F, 9.0F, 17.0F, new CubeDeformation(0.0F))
				.texOffs(62, 261).addBox(9.0F, 0.0F, -10.0F, 13.0F, 10.0F, 15.0F, new CubeDeformation(0.0F))
				.texOffs(67, 506).addBox(10.0F, -1.0F, 32.0F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(53, 480).addBox(9.0F, 0.0F, 23.0F, 4.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 13.0F, 12.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r3 = arm.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(114, 314).addBox(-20.0F, -10.0F, -8.0F, 10.0F, 20.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(32.0F, 6.0F, 2.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r4 = arm.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(102, 348).addBox(10.0F, -2.0F, 12.0F, 13.0F, 7.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 17.0F, 12.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r5 = arm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(13, 506).addBox(10.0F, -1.0F, 32.0F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0F, 13.0F, 10.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r6 = arm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(40, 506).addBox(10.0F, -1.0F, 32.0F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 13.0F, 11.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r7 = arm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(94, 521).addBox(10.0F, -1.0F, 32.0F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 10.0F, 6.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r8 = arm.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(167, 439).addBox(9.0F, 0.0F, 18.0F, 6.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, 12.0F, 11.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition right = arms.addOrReplaceChild("right", CubeListBuilder.create().texOffs(161, 165).addBox(-24.0F, -5.0F, -8.0F, 11.0F, 20.0F, 15.0F, new CubeDeformation(0.0F))
				.texOffs(0, 348).addBox(-22.0F, -16.0F, -10.0F, 11.0F, 11.0F, 15.0F, new CubeDeformation(0.0F))
				.texOffs(202, 439).addBox(-9.0F, -11.0F, -13.0F, 11.0F, 22.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(129, 375).mirror().addBox(-17.0F, -17.0F, -14.0F, 15.0F, 17.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 220).addBox(-19.0F, -19.0F, -13.0F, 13.0F, 14.0F, 15.0F, new CubeDeformation(0.0F))
				.texOffs(208, 348).addBox(-22.0F, -10.0F, -7.0F, 11.0F, 10.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -10.0F, 2.0F));

		PartDefinition cube_r9 = right.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(161, 314).addBox(-20.0F, -10.0F, -8.0F, 10.0F, 20.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 11.0F, 2.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition belowelbow = right.addOrReplaceChild("belowelbow", CubeListBuilder.create(), PartPose.offset(-6.0F, 18.0F, 12.0F));

		PartDefinition cube_r10 = belowelbow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(62, 287).addBox(-22.0F, 0.0F, -10.0F, 13.0F, 10.0F, 15.0F, new CubeDeformation(0.0F))
				.texOffs(257, 220).addBox(-20.0F, -1.0F, 0.0F, 11.0F, 9.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition hand = belowelbow.addOrReplaceChild("hand", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition cube_r11 = hand.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(155, 348).addBox(-23.0F, -2.0F, 12.0F, 13.0F, 7.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition fingers = hand.addOrReplaceChild("fingers", CubeListBuilder.create(), PartPose.offset(-6.0F, -4.0F, 2.0F));

		PartDefinition pinky = fingers.addOrReplaceChild("pinky", CubeListBuilder.create(), PartPose.offset(-6.0F, -1.0F, -3.0F));

		PartDefinition cube_r12 = pinky.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(132, 439).addBox(-15.0F, 0.0F, 18.0F, 6.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r13 = pinky.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(13, 521).addBox(-12.0F, -1.0F, 32.0F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -2.0F, -5.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition middle = fingers.addOrReplaceChild("middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r14 = middle.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 468).addBox(-17.0F, 0.0F, 23.0F, 10.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r15 = middle.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(67, 521).addBox(-12.0F, -1.0F, 32.0F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -3.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r16 = middle.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(40, 521).addBox(-12.0F, -1.0F, 32.0F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, -4.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition pointer = fingers.addOrReplaceChild("pointer", CubeListBuilder.create(), PartPose.offset(6.0F, 0.0F, -2.0F));

		PartDefinition cube_r17 = pointer.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(94, 506).addBox(-12.0F, -1.0F, 32.0F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(86, 468).addBox(-13.0F, 0.0F, 23.0F, 4.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);

	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch,ageInTicks);

		this.animateWalk(ModAnimationDefinitions.FARDIE_WALK, limbSwing, limbSwingAmount, 2f,2.5f);
		this.animate(((FardieMonsterEntity) entity).idleAnimationState, ModAnimationDefinitions.FARDIE_IDLE, ageInTicks,1f);
		this.animate(((FardieMonsterEntity) entity).attackAnimationState, ModAnimationDefinitions.FARDIE_ATTACK, ageInTicks,1.1f);
	}


	public void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30f,30f);
		pHeadPitch = Mth.clamp(pHeadPitch, -25f,45f);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI /180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI /180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fardiemonster.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return fardiemonster;
	}


}