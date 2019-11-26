package com.papagreat.rizor.recipes;

import com.papagreat.rizor.init.ItemInit;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes 
{
         public static void init()
         {
        	 GameRegistry.addSmelting(new ItemStack(Blocks.OBSIDIAN), new ItemStack(ItemInit.OBSIDIAN_INGOT), 0.4f);
        	 GameRegistry.addSmelting(new ItemStack(Blocks.COAL_BLOCK), new ItemStack(ItemInit.PULSATING_COAL), 0.8f);
        	 
         }
}