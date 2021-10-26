package de.ardania.teleportblocker.events;

import com.alessiodp.parties.api.events.bukkit.player.BukkitPartiesPlayerPreHomeEvent;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

import java.util.Arrays;
import java.util.List;

/**
 * @author Umbreon
 */

public class BukkitPartiesPlayerPreHome implements Listener {

    List<String> worlds = Arrays.asList("normal_mine", "mine3", "nether", "end");

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBukkitPartiesPlayerPreHomeEvent(BukkitPartiesPlayerPreHomeEvent event) {
        System.out.println("BukkitPartiesPlayerPreHomeEvent");
        String playerName = event.getPartyPlayer().getName();
        Player player = Bukkit.getServer().getPlayer(playerName);
        for (String world : worlds) {
            assert player != null;
            if (player.getWorld().toString().equalsIgnoreCase(world)) {
                event.setCancelled(true);
                System.out.println(event.isCancelled());
            }
        }
    }

}
