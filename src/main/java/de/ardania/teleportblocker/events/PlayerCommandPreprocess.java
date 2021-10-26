package de.ardania.teleportblocker.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import java.util.Arrays;

/**
 * @author Umbreon
 */

public class PlayerCommandPreprocess implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPreCommand(PlayerCommandPreprocessEvent event) {
        System.out.println("PlayerCommandPreprocessEvent");
        String[] args = event.getMessage().split(" ");
        System.out.println(">" + Arrays.toString(args));
        if (args[0].equalsIgnoreCase("/guild") && args[1].equalsIgnoreCase("home")) {
            System.out.println("Command is /guild home !!");
            event.setCancelled(true);
            System.out.println(event.isCancelled());
        }
    }
}
