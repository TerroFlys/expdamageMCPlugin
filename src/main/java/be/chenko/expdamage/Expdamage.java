package be.chenko.expdamage;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Expdamage extends JavaPlugin {
    public final String pluginName = "[Exp Damage]";
    public final Logger LOGGER = getLogger();

    @Override
    public void onEnable() {
        // Plugin startup logic

        LOGGER.info(String.format("%s has loaded", pluginName));
        Listeners listeners = new Listeners();
        getServer().getPluginManager().registerEvents(listeners,this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        LOGGER.info(String.format("%s has unloaded", pluginName));

    }
}
