package de.ardania.teleportblocker;

import de.ardania.teleportblocker.commands.Guild;
import de.ardania.teleportblocker.events.BukkitPartiesPlayerPreHome;
import de.ardania.teleportblocker.events.PlayerCommandPreprocess;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

/**
 * @author Umbreon
 */

public class TeleportBlocker extends JavaPlugin {

    @Override
    public void onEnable() {
        Guild guild = new Guild();
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerCommandPreprocess(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new BukkitPartiesPlayerPreHome(), this);
        // Objects.requireNonNull(getCommand("guild")).setExecutor(guild);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

}