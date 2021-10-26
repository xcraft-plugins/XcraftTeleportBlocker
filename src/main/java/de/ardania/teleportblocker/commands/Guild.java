package de.ardania.teleportblocker.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * @author Umbreon
 */

public class Guild implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (strings[0].equalsIgnoreCase("home")) {
            commandSender.sendMessage("Du darfst das nicht tun.");
        }
        return false;
    }
}
