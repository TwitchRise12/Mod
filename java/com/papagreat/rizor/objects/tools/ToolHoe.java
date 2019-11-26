package com.papagreat.rizor.objects.tools;

import com.papagreat.rizor.Main;
import com.papagreat.rizor.init.ItemInit;
import com.papagreat.rizor.util.interfaces.IHasModel;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel {

	public ToolHoe(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.RIZORTAB);
		
		ItemInit.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}


}
