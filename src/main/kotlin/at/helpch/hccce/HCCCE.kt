package at.helpch.hccce

import at.helpch.hccce.commands.CrashCommand
import at.helpch.hccce.commands.OnlineCommand
import org.bukkit.plugin.java.JavaPlugin

class HCCCE : JavaPlugin() {

    override fun onEnable() {
        firstTime()
        this.getCommand("online")?.setExecutor(OnlineCommand())
        //jollyperson start
        this.getCommand("crash")?.setExecutor(CrashCommand())
        //jollyperson end
    }
}
