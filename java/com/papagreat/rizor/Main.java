package com.papagreat.rizor;

import com.papagreat.rizor.proxy.CommonProxy;
import com.papagreat.rizor.recipes.SmeltingRecipes;
import com.papagreat.rizor.tabs.RizorTab;
import com.papagreat.rizor.util.Reference;
import com.papagreat.rizor.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs RIZORTAB = new RizorTab("rizortab");
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) 
	{
		RegistryHandler.preInitRegistries();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) 
	{
	    RegistryHandler.initRegistries();
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event) 
	{
		RegistryHandler.postInitregistries();
	}
	
	@EventHandler
	public static void serverInit(FMLServerStartingEvent event)
	{
		RegistryHandler.serverRegistries(event);
	}
}
