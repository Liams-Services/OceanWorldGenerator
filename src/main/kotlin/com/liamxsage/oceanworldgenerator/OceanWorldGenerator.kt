package com.liamxsage.oceanworldgenerator

import com.liamxsage.oceanworldgenerator.generator.OceanWorldChunkGenerator
import org.bukkit.generator.ChunkGenerator
import org.bukkit.plugin.java.JavaPlugin

class OceanWorldGenerator : JavaPlugin() {

    companion object {
        lateinit var instance: OceanWorldGenerator
            private set
    }

    init {
        instance = this
    }

    override fun onEnable() {
        // Plugin startup logic

        logger.info("Enabling OceanWorldGenerator...")

        logger.info("Add the following block to your bukkit.yml:")
        logger.info("worlds:")
        logger.info("  world:")
        logger.info("    generator: OceanWorldGenerator")

        logger.info("OceanWorldGenerator is now generating your world!")
    }

    override fun getDefaultWorldGenerator(worldName: String, id: String?): ChunkGenerator {
        return OceanWorldChunkGenerator()
    }
}