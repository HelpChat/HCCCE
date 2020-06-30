// kaliber start
package at.helpch.hccce.commands

import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class OnlineCommand : CommandExecutor {

    override fun onCommand(sender: CommandSender, cmd: Command, lbl: String, args: Array<out String>): Boolean {
        sender.sendMessage("${Bukkit.getOnlinePlayers().size}")
        return true
    }
}
// kaliber end
