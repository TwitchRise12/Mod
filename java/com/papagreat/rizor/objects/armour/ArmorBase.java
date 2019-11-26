package com.papagreat.rizor.objects.armour;

import com.papagreat.rizor.Main;
import com.papagreat.rizor.init.ItemInit;
import com.papagreat.rizor.util.interfaces.IHasModel;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel 
{

	public ArmorBase(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlot) 
	{
		super(material, renderIndex, equipmentSlot);
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
