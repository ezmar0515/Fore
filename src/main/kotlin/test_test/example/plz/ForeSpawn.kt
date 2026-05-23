package test_test.example.plz

import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.World
import org.bukkit.entity.EntityType
import org.bukkit.entity.LivingEntity
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.plugin.java.JavaPlugin
import java.util.*

class Fore_copy : JavaPlugin(), Listener{

    override fun onEnable() {
        server.pluginManager.registerEvents(this, this)
        logger.info("Fore_copy working")
    }

    @EventHandler
    fun onBlockBreak(event: BlockBreakEvent) {
        val block = event.block
        val location = block.location

        if (block.type == Material.COAL_ORE) {
            spawnRandomMobCoal(location)
        }
        if (block.type == Material.DEEPSLATE_COAL_ORE) {
            spawnRandomMobCoal(location)
        }
        if (block.type == Material.IRON_ORE) {
            spawnRandomMobIron(location)
        }
        if (block.type == Material.DEEPSLATE_IRON_ORE) {
            spawnRandomMobIron(location)
        }
        if (block.type == Material.COPPER_ORE) {
            spawnRandomMobCopper(location)
        }
        if (block.type == Material.DEEPSLATE_COPPER_ORE) {
            spawnRandomMobCopper(location)
        }
        if (block.type == Material.GOLD_ORE) {
            spawnRandomMobGold(location)
        }
        if (block.type == Material.DEEPSLATE_GOLD_ORE) {
            spawnRandomMobGold(location)
        }
        if (block.type == Material.REDSTONE_ORE) {
            spawnRandomMobRedstone(location)
        }
        if (block.type == Material.DEEPSLATE_REDSTONE_ORE) {
            spawnRandomMobRedstone(location)
        }
        if (block.type == Material.LAPIS_ORE) {
            spawnRandomMobLapis(location)
        }
        if (block.type == Material.DEEPSLATE_LAPIS_ORE) {
            spawnRandomMobLapis(location)
        }
        if (block.type == Material.EMERALD_ORE) {
            spawnRandomMobEmerald(location)
        }
        if (block.type == Material.DEEPSLATE_EMERALD_ORE) {
            spawnRandomMobEmerald(location)
        }
        if (block.type == Material.DIAMOND_ORE) {
            spawnRandomMobDiamond(location)
        }
        if (block.type == Material.DEEPSLATE_DIAMOND_ORE) {
            spawnRandomMobDiamond(location)
        }
    }

    fun spawnRandomMobCoal(location: Location) {
        val mobTypesCoal = listOf("COW", "SQUID", "BAT", "PANDA", "WITHER", "WITHER_SKELETON", "ENDER_DRAGON", "MAGMA_CUBE")
        val randomMobType = EntityType.valueOf(mobTypesCoal[Random().nextInt(mobTypesCoal.size)])
        val world: World = location.world
        world.spawnEntity(location, randomMobType) as LivingEntity
    }

    fun spawnRandomMobIron(location: Location) {
        val mobTypesIron = listOf("GOAT", "PANDA", "IRON_GOLEM", "SHEEP", "COW", "MOOSHROOM", "CHICKEN", "SNOW_GOLEM", "WOLF", "POLAR_BEAR", "SKELETON", "GHAST", "ELDER_GURDIAN")
        val randomMobType = EntityType.valueOf(mobTypesIron[Random().nextInt(mobTypesIron.size)])
        val world: World = location.world
        world.spawnEntity(location, randomMobType) as LivingEntity
    }

    fun spawnRandomMobCopper(location: Location) {
        val mobTypesCopper = listOf("FOX", "IRON_GOLEM", "SNOW_GOLEM", "GUARDIAN", "TURTLE", "SNIFFER", "ZOMBIE", "ZOMBIE_VILLAGER", "SLIME", "CREEPER", "GLOW_SQUID", "DROUND")
        val randomMobType = EntityType.valueOf(mobTypesCopper[Random().nextInt(mobTypesCopper.size)])
        val world: World = location.world
        world.spawnEntity(location, randomMobType) as LivingEntity
    }

    fun spawnRandomMobGold(location: Location) {
        val mobTypesGold = listOf("OCELOT", "CAMEL", "BEE", "PUFFERFISH", "BLAZE", "HUSK")
        val randomMobType = EntityType.valueOf(mobTypesGold[Random().nextInt(mobTypesGold.size)])
        val world: World = location.world
        world.spawnEntity(location, randomMobType) as LivingEntity
    }

    fun spawnRandomMobRedstone(location: Location) {
        val mobTypesRedstone = listOf("MOOSHROOM", "CHICKEN", "STRIDER", "SNIFFER", "SALMON", "MAGMA_CUBE")
        val randomMobType = EntityType.valueOf(mobTypesRedstone[Random().nextInt(mobTypesRedstone.size)])
        val world: World = location.world
        world.spawnEntity(location, randomMobType) as LivingEntity
    }

    fun spawnRandomMobLapis(location: Location) {
        val mobTypesLapislazuli = listOf("ZOMBIE", "WARDEN", "PHANTOM", "GUARDIAN", "WANDERING_TRADER")
        val randomMobType = EntityType.valueOf(mobTypesLapislazuli[Random().nextInt(mobTypesLapislazuli.size)])
        val world: World = location.world
        world.spawnEntity(location, randomMobType) as LivingEntity
    }

    fun spawnRandomMobEmerald(location: Location) {
        val mobTypesEmerald = listOf("TURTLE", "SNIFFER", "ZOMBIE", "ZOMBIE_VILLAGER", "SLIME", "CREEPER", "GLOW_SQUID", "DROUND")
        val randomMobType = EntityType.valueOf(mobTypesEmerald[Random().nextInt(mobTypesEmerald.size)])
        val world: World = location.world
        world.spawnEntity(location, randomMobType) as LivingEntity
    }

    fun spawnRandomMobDiamond(location: Location) {
        val mobTypesDiamond = listOf("ZOMBIE", "WARDEN", "PHANTOM", "GUARDIAN", "WANDERING_TRADER", "ALLAY", "GLOW_SQUID", "DROWNED", "DOLPHIN")
        val randomMobType = EntityType.valueOf(mobTypesDiamond[Random().nextInt(mobTypesDiamond.size)])
        val world: World = location.world
        world.spawnEntity(location, randomMobType) as LivingEntity
    }
}
