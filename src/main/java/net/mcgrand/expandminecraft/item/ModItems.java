package net.mcgrand.expandminecraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.mcgrand.expandminecraft.ExpandMinecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item MAGIC_WAND = registerItems("magic_wand", new Item(new FabricItemSettings().group(ItemGroup.COMBAT)));


    private static Item registerItems(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ExpandMinecraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ExpandMinecraft.LOGGER.info("Registering Mod Items");

    }
}
