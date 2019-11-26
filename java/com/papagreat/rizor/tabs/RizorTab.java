package com.papagreat.rizor.tabs;

import com.papagreat.rizor.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RizorTab extends CreativeTabs
{
     public RizorTab(String label)
     {
    	 super("rizormodtab");
    	 this.setBackgroundImageName("rizormod.png");
     }
     
     @Override
     public ItemStack getTabIconItem()
     {
    	 return new ItemStack(ItemInit.OBSIDIAN_INGOT);
     }
}
