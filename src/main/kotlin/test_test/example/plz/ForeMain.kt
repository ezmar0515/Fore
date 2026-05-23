package test_test.example.plz

import org.bukkit.plugin.java.JavaPlugin

class Plz : JavaPlugin() {

    override fun onEnable() {
        logger.info("Plugin enabled")
    }

    override fun onDisable() {
        logger.info("Plugin disabled")
    }
}
