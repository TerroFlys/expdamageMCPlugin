package be.chenko.expdamage;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Expdamage extends JavaPlugin {
    private static Expdamage plugin;
    public final String PLUGIN_NAME = "Exp Damage";
    public final Logger LOGGER = getLogger();
    //FileConfiguration config = this.getConfig();

    @Override
    public void onEnable() {
        // Plugin startup logic
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        plugin = this;
        boolean isEnabled = getConfig().getBoolean("enable-exp-damage");

        LOGGER.info(String.format("[%s] has loaded", PLUGIN_NAME));
        LOGGER.info(String.format("[%s] has been set to %b in the config.yml", PLUGIN_NAME, isEnabled));
        LOGGER.warning(String.format("[%s] if you still have the config from version 1.2, please remove the config file.", PLUGIN_NAME));
        getServer().getPluginManager().registerEvents(new Listeners(), this);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        LOGGER.info(String.format("[%s] has unloaded", PLUGIN_NAME));
        LOGGER.warning(String.format("[%s] if you still have the config from version 1.2, please remove the config file.", PLUGIN_NAME));

    }

    public static Expdamage getPlugin() {
        return plugin;
    }
}
