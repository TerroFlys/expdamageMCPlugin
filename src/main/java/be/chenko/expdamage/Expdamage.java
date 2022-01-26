package be.chenko.expdamage;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Expdamage extends JavaPlugin {
    public final String pluginName = "Exp Damage";
    public final Logger LOGGER = getLogger();


    @Override
    public void onEnable() {
        // Plugin startup logic
        getConfig().options().copyDefaults();
        saveDefaultConfig();


        boolean isEnabled = getConfig().getBoolean("enable-exp-damage");

        LOGGER.info(String.format("[%s] has loaded", pluginName));
        LOGGER.info(String.format("[%s] has been set to %b in the config.yml", pluginName, isEnabled));
        if (isEnabled){
            getServer().getPluginManager().registerEvents(new Listeners(), this);
        }

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        LOGGER.info(String.format("[%s] has unloaded", pluginName));

    }
}
