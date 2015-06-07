package com.tesract.nilcraft;

import net.minecraftforge.common.config.Configuration;

import com.tesract.nilcraft.ObjRepo._;
/*
 * @author tesract
 */

object NilCraftConfig
{
    //var param:Type=defaultVal
    
    def loadForgeConfig(config:Configuration) {
        config.load();

//        param = config.getBlock("FlIsBuilder", block_FlIsBuilder_id).getInt
//        block_FlIsBuilder = new FlIsBuilder(block_FlIsBuilder_id, Material.anvil)

//        item_FlIsModule_id = config.getBlock("FlIsModule", item_FlIsModule_id).getInt
//        item_FlIsModule = new FlIsModule(item_FlIsModule_id)

        config.save();

        logger.info("[NilCraftConfig] Loaded configuration.");
    }
}