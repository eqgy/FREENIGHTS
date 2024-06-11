package net.eqgy.freenights.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.eqgy.freenights.FreeNights;
import net.eqgy.freenights.entity.custom.FardieMonsterEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;

public class FardieMonsterRenderer extends MobRenderer<FardieMonsterEntity,FardieMonsterModel<FardieMonsterEntity>> {


    public FardieMonsterRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new FardieMonsterModel<>(pContext.bakeLayer(ModModelLayers.FARDIEMONSTER_LAYER)),2f);
    }

    @Override
    public ResourceLocation getTextureLocation(FardieMonsterEntity fardieMonsterEntity) {
        return new ResourceLocation(FreeNights.MODID, "textures/entity/fardie_monster.png");
    }

    @Override
    public void render(FardieMonsterEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {

        pPoseStack.scale(.5f,.5f,.5f);
        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);

    }
}
