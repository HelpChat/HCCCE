package at.helpch.hccce

import at.helpch.hccce.commands.LeakCommand
import at.helpch.hccce.commands.OnlineCommand
import me.bristermitten.pdm.PluginDependencyManager
import org.bukkit.plugin.java.JavaPlugin

class HCCCE : JavaPlugin() {

    override fun onEnable() {
        PluginDependencyManager(this).loadAllDependencies().join()
        firstTime()
        this.getCommand("online")?.setExecutor(OnlineCommand())
        getCommand("leak")?.setExecutor(LeakCommand(this))
    }
}
