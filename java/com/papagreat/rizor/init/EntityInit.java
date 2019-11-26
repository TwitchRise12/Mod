package com.papagreat.rizor.init;

import com.papagreat.rizor.Main;
import com.papagreat.rizor.entity.sigor.EntitySigor;
import com.papagreat.rizor.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
  public static void registerEntities() 
  {
	  registerEntity("sigor", EntitySigor.class, Reference.ENTITY_SIGOR, 60, 3981802, 9960114);
  }
  
  private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
  {
	  EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
  }
 
  private static void registerNonMobRegistry()
  
  {
	  
  }
}
