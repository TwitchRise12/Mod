package com.papagreat.rizor.util.handlers;

import com.papagreat.rizor.init.BlockInit;
import com.papagreat.rizor.init.EntityInit;
import com.papagreat.rizor.init.ItemInit;
import com.papagreat.rizor.recipes.SmeltingRecipes;
import com.papagreat.rizor.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
	    event.getRegistry().registerAll(ItemInit .ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ItemInit.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : BlockInit.BLOCKS)
		{
	       if(block instanceof IHasModel)
	       {
	    	   ((IHasModel)block).registerModels();   
	       }
		}
	 }
	
	@SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    
    }
	
	public static void preInitRegistries()
	{
		EntityInit.registerEntities();
		RenderHandler.registerEntityRenders();
		
	}
	
	public static void initRegistries()
	{
		SmeltingRecipes.init();
	}
	
	public static void postInitregistries()
	{
		
	}
	
	public static void serverRegistries(FMLServerStartingEvent event)
	{
		
	}
	
}
