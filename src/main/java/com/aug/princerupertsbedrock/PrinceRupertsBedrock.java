package com.aug.princerupertsbedrock;

import com.aug.princerupertsbedrock.block.ModBlocks;
import com.aug.princerupertsbedrock.enchantments.ModEnchantments;
import com.aug.princerupertsbedrock.world.features.ModConfiguredFeatures;
import com.aug.princerupertsbedrock.world.features.ModPlacedFeatures;
import com.aug.princerupertsbedrock.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrinceRupertsBedrock implements ModInitializer {

	public static final Logger LOGGER = LogManager.getLogger("Prince Rupert's Bedrock");
	public static final String MOD_ID = "princerupertsbedrock";

	@Override
	public void onInitialize() {
		//ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModConfiguredFeatures.registerConfiguredFeatures();
		ModPlacedFeatures.registerPlacedFeatures();

		ModEnchantments.registerModEnchantments();

		ModWorldGen.generateModWorldGen();

		LOGGER.info("Finished initializing!");
	}

}
