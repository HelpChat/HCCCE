package at.helpch.hccce

import org.bukkit.Bukkit
import org.bukkit.command.CommandSender

// Yugi Start

/**
 * Smaller command declaration since we only have 250 chars per commit
 */
fun String.asCmd(execute: (CommandSender, Array<out String>) -> Boolean) {
    Bukkit.getPluginCommand(this)?.setExecutor { sender, _, _, args -> execute(sender, args); }
}

// Yugi End
