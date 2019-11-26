package com.papagreat.rizor.util.handlers;



import com.papagreat.rizor.entity.sigor.EntitySigor;
import com.papagreat.rizor.entity.sigor.RenderSigor;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
      public static void registerEntityRenders()
      {
    	  RenderingRegistry.registerEntityRenderingHandler(EntitySigor.class, new  IRenderFactory<EntitySigor>()
    	  {
    		  @Override
    		public Render<? super EntitySigor> createRenderFor(RenderManager manager) 
    		  {
    			return new RenderSigor(manager);
    		}
		});

 }     
}
	


