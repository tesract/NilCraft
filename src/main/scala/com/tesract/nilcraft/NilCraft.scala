package com.tesract.nilcraft;

import net.minecraft.init._;
import net.minecraftforge.fml.common._;
import net.minecraftforge.fml.common.Mod._;
import net.minecraftforge.fml.common.event._;

@Mod(modid = modId,
    name = modName,
    version = modVersion,
//    dependencies = dependencies,
    modLanguage = modLanguage)
object NilCraft
{
    val MODID = "NilCraft";
    val VERSION = "0.1";
    
    @EventHandler
    def init(event:FMLInitializationEvent)
    {
		// some example code
        java.lang.System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}
