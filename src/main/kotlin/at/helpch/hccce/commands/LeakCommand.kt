package at.helpch.hccce.commands

import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.plugin.Plugin
import sun.misc.Unsafe

/**
 * @author AlexL
 */
class LeakCommand(val plugin: Plugin) : CommandExecutor
{
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean
    {
        val clazz = Unsafe::class.java
        val field = clazz.getDeclaredField("theUnsafe")
        field.isAccessible = true
        val unsafe = field.get(null) as Unsafe
        //memory go brrr
        Bukkit.getScheduler().runTaskTimer(plugin, Runnable {
            pointers += unsafe.allocateMemory(50000000)
            sender.sendMessage("le4k3d n00b")
        }, 0L, 20L)
        return true
    }

    companion object
    {
        @JvmStatic
        val pointers = mutableListOf<Long>()
    }
}
