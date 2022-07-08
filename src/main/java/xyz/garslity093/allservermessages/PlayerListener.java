package xyz.garslity093.allservermessages;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public final class PlayerListener implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void asyncPlayerChatEvent(AsyncPlayerChatEvent event) {
        if (!event.isCancelled()) {
            event.setCancelled(true);
            AsmPlugin.getInstance().getServer().broadcastMessage(event.getFormat().replace("%1$s", event.getPlayer().getDisplayName()).replace("%2$s", event.getMessage()));
        }
    }
}
