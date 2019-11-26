package com.papagreat.rizor.entity.sigor;

import com.papagreat.rizor.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSigor extends RenderLiving<EntitySigor>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MOD_ID + ":textures/entity/sigor/sigor.png");
	
	public RenderSigor(RenderManager manager) 
	{
		super(manager, new ModelSigor(), 0.2f);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntitySigor entity) 
	{
		return TEXTURE;
	}
}
