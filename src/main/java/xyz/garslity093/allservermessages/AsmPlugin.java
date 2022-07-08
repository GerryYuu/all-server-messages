package xyz.garslity093.allservermessages;

import org.bukkit.plugin.java.JavaPlugin;

public final class AsmPlugin extends JavaPlugin {

    public static JavaPlugin getInstance() {
        return JavaPlugin.getPlugin(AsmPlugin.class);
    }

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);
    }
}
