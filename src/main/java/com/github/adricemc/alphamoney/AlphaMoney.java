package com.github.adricemc.alphamoney;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AlphaMoney extends JavaPlugin {

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {
        Bukkit.getScheduler().cancelTasks(this);
    }
}
