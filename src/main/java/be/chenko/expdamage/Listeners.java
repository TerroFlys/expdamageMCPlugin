package be.chenko.expdamage;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerExpChangeEvent;

public class Listeners implements Listener {


    @EventHandler
    public void PlayerExpChangeEvent(PlayerExpChangeEvent event) {


        Player player = event.getPlayer();
        if (!player.hasPermission("expdamage.exempt")) {
            double dmg = event.getAmount() / 3;
            player.damage(dmg);
        }


    }


}
