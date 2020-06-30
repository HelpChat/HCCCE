package at.helpch.hccce.commands

import at.helpch.hccce.HCCCE
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class PingCommand(plugin: HCCCE) : CommandExecutor {
    init {
        // Jaims Start
        plugin.getCommand("ping")?.setExecutor(this) // TODO: null check here
        // Jaims end
    }

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        TODO("Add command functionality lol")
    }

}