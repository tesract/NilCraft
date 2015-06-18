package com.tesract.nilcraft.events

import net.minecraft.entity.player.EntityPlayer
import net.minecraft.world.World

/**
 * @author eb3843
 */
sealed trait NilEvent
case object tick extends NilEvent
case class PlayerJoin(player:EntityPlayer, world:World) extends NilEvent
case class PlayerLeave(player:EntityPlayer, world:World) extends NilEvent
case class CreateShrine(x:Int, y:Int, z:Int, w:Int, h:Int, l:Int) extends NilEvent
