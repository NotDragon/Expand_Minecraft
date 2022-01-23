package net.mcgrand.expandminecraft;

import net.fabricmc.api.ModInitializer;
import net.mcgrand.expandminecraft.block.ModBlocks;
import net.mcgrand.expandminecraft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExpandMinecraft implements ModInitializer {
	public static final String MOD_ID = "expandminecraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlcoks();
	}
}
