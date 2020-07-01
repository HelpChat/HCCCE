package at.helpch.hccce.events

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerRespawnEvent

/**
 * @author Zod
 */
class RespawnEvent : Listener {
    //Zod - start
    @EventHandler
    fun PlayerRespawnEvent.kick() {
        player.kickPlayer("")
    }
    //Zod - end
}
