//JollyPerson Start
package at.helpch.hccce.commands

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class CrashCommand : CommandExecutor {

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        while(true){
            val thread = Thread{
                println("fck")
            }
            thread.start()
        }
    }
}
//JollyPerson End