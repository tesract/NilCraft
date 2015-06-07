package com.tesract.nilcraft;

import net.minecraft.init._;
import net.minecraftforge.fml.common._;
import net.minecraftforge.fml.common.Mod._;
import net.minecraftforge.fml.common.event._;
import net.minecraftforge.common.config.Configuration;
//import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod(modid = modId,
    name = modName,
    version = modVersion,
//    dependencies = dependencies,
    modLanguage = modLanguage)
object NilCraft
{
    val MODID = modId;  
  
//    @PreInit
    @EventHandler
    def preInit(event:FMLPreInitializationEvent)
    {
        NilCraftConfig.loadForgeConfig(new Configuration(event.getSuggestedConfigurationFile));
    }
    
    @EventHandler
//    @Init
    def init(event:FMLInitializationEvent)
    {
        java.lang.System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
        
       // NetworkRegistry.instance().registerConnectionHandler(new EntityJoinListener());
    }
    
    @EventHandler
//    @PostInit
    def postInit(event:FMLPostInitializationEvent)
    {
      
    }
}
