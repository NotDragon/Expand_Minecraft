package net.mcgrand.expandminecraft.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.mcgrand.expandminecraft.ExpandMinecraft;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block UNDEAD_BLOCK = registerBlock("undead_block",new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()),ItemGroup.BUILDING_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(ExpandMinecraft.MOD_ID, name),block);

    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(ExpandMinecraft.MOD_ID, name),new BlockItem(block,new FabricItemSettings().group(group)));
    }

    public static void registerModBlcoks(){
        ExpandMinecraft.LOGGER.info("Registering Mod Blocks");
    }
}
