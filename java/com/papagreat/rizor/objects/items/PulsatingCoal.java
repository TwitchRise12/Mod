package com.papagreat.rizor.objects.items; 

import com.papagreat.rizor.Main;
import com.papagreat.rizor.init.ItemInit;
import com.papagreat.rizor.util.interfaces.IHasModel; 

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack; 

public class PulsatingCoal extends Item implements IHasModel 
{ 
	public PulsatingCoal(String name) 
	{ 
		setUnlocalizedName(name);
		setRegistryName(name); 
		setCreativeTab(Main.RIZORTAB);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public int getItemBurnTime(ItemStack itemStack) 
	{
		return 20000;
	}

	@Override
	public void registerModels() 
	{
	Main.proxy.registerItemRenderer(this, 0, "inventory");	
	} 
}