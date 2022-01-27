package be.chenko.expdamage;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerExpChangeEvent;

public class Listeners implements Listener {
    boolean isEnabled = Expdamage.getPlugin().getConfig().getBoolean("enable-exp-damage");
    double divider = Expdamage.getPlugin().getConfig().getDouble("amount-divider");

    @EventHandler
    public void PlayerExpChangeEvent(PlayerExpChangeEvent event) {
        if (isEnabled){
            Player player = event.getPlayer();
            if (!player.hasPermission("expdamage.exempt")) {
                double dmg = event.getAmount() / divider;
                player.damage(dmg);
            }
        }
    }


}
