package com.papagreat.rizor.init;

import java.util.ArrayList;
import java.util.List;

import com.papagreat.rizor.objects.armour.ArmorBase;
import com.papagreat.rizor.objects.items.ItemBase;
import com.papagreat.rizor.objects.items.PulsatingCoal;
import com.papagreat.rizor.objects.tools.ToolAxe;
import com.papagreat.rizor.objects.tools.ToolHoe;
import com.papagreat.rizor.objects.tools.ToolPickaxe;
import com.papagreat.rizor.objects.tools.ToolShovel;
import com.papagreat.rizor.objects.tools.ToolSword;
import com.papagreat.rizor.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial TOOL_ELECTRINE = EnumHelper.addToolMaterial("tool_electrine", 3, 720, 7.0f, 2.5f, 7);
	public static final ArmorMaterial ARMOR_ELECTRINE = EnumHelper.addArmorMaterial("armor_electrine", Reference.MOD_ID + ":electrine", 23, new int[]{2, 6, 7, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F);
	
	//Items
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");
	public static final Item ELECTRINE = new ItemBase("electrine");
	public static final Item PULSATING_COAL = new PulsatingCoal("pulsating_coal");
	
	//Tools
	public static final Item AXE_ELECTRINE = new ToolAxe("axe_electrine", TOOL_ELECTRINE);
	public static final Item HOE_ELECTRINE = new ToolHoe("hoe_electrine", TOOL_ELECTRINE);
	public static final Item PICKAXE_ELECTRINE = new ToolPickaxe("pickaxe_electrine", TOOL_ELECTRINE);
	public static final Item SHOVEL_ELECTRINE = new ToolShovel("shovel_electrine", TOOL_ELECTRINE);
	public static final Item SWORD_ELECTRINE = new ToolSword("sword_electrine", TOOL_ELECTRINE);
	
	//Armor
	public static final Item HELMET_ELECTRINE = new ArmorBase("helmet_electrine", ARMOR_ELECTRINE, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_ELECTRINE = new ArmorBase("chestplate_electrine", ARMOR_ELECTRINE, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_ELECTRINE = new ArmorBase("leggings_electrine", ARMOR_ELECTRINE, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_ELECTRINE = new ArmorBase("boots_electrine", ARMOR_ELECTRINE, 1, EntityEquipmentSlot.FEET);
}
