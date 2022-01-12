package com.aug.princerupertsbedrock.block;

import com.aug.princerupertsbedrock.PrinceRupertsBedrock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block BEDROCK_TAIL = registerBlock("bedrock_tail", new Block(FabricBlockSettings
            .of(Material.STONE)
            .strength(-1.0f, 4800.0f)
            .requiresTool()
            .dropsNothing()
    ));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(PrinceRupertsBedrock.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(
                Registry.ITEM,
                new Identifier(PrinceRupertsBedrock.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ItemGroup.MISC))
        );
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + PrinceRupertsBedrock.MOD_ID);
    }
}
