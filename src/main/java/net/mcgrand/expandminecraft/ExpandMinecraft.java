package net.mcgrand.expandminecraft;

import net.fabricmc.api.ModInitializer;
import net.mcgrand.expandminecraft.block.ModBlocks;
import net.mcgrand.expandminecraft.enchantment.ModEnchantments;
import net.mcgrand.expandminecraft.item.ModItems;
//import net.mcgrand.expandminecraft.world.features.ModConfiguredFeatures;
//import net.mcgrand.expandminecraft.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExpandMinecraft implements ModInitializer {
	public static final String MOD_ID = "expandminecraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlcoks();
		//ModConfiguredFeatures.registerConfiguredFeatures();
		ModEnchantments.registerEnchantments();
		//ModWorldGeneration.generateModWorldGen();
		System.out.println("Hello Fabric world!");

	}
}
