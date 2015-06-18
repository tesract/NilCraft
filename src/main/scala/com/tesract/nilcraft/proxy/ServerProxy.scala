package com.tesract.nilcraft.proxy

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.common.config.Configuration
import com.tesract.nilcraft.EntityJoinListener
import com.tesract.nilcraft.NilCraftConfig
import org.apache.logging.log4j.LogManager


/**
 * @author eb3843
 */
class ServerProxy extends CommonProxy 
{
    val log = LogManager.getLogger("ServerProxy")
    
    override def preInit(event:FMLPreInitializationEvent)
    {
        NilCraftConfig.loadForgeConfig(new Configuration(event.getSuggestedConfigurationFile));
    }
      
    override def init(event:FMLInitializationEvent)
    {
    }
    
    override def postInit(event:FMLPostInitializationEvent)
    {
    }
  
}