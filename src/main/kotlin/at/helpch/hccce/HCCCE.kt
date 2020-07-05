package at.helpch.hccce

import at.helpch.hccce.commands.OnlineCommand
import org.bukkit.plugin.java.JavaPlugin

class HCCCE : JavaPlugin() {

    override fun onEnable() {
        firstTime()
        this.getCommand("online")?.setExecutor(OnlineCommand())
    }
}
