package net.mcgrand.expandminecraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.mcgrand.expandminecraft.ExpandMinecraft;
import net.mcgrand.expandminecraft.item.custom.ModAxeItem;
import net.mcgrand.expandminecraft.item.custom.ModHoeItem;
import net.mcgrand.expandminecraft.item.custom.ModPickaxeItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item UNDEAD_STICK = registerItems("undead_stick", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item ENDERITY_INGOT = registerItems("enderity_ingot", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item ENDERITY_SWORD = registerItems("enderity_sword", new SwordItem(ModToolMaterial.ENDERITY, 2, -2, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item ENDERITY_AXE = registerItems("enderity_axe", new ModAxeItem(ModToolMaterial.ENDERITY, 4, -2.5f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item ENDERITY_PICKAXE= registerItems("enderity_pickaxe", new ModPickaxeItem(ModToolMaterial.ENDERITY, -1, 1, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item ENDERITY_HOE = registerItems("enderity_hoe", new ModHoeItem(ModToolMaterial.ENDERITY, 1, -1, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item ENDERITY_SHOVEL = registerItems("enderity_shovel", new ShovelItem(ModToolMaterial.ENDERITY, 0, 1, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item ENDERITY_HELMET = registerItems("enderity_helmet", new ArmorItem(ModArmorMaterial.ENDERITY, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item ENDERITY_CHESTPLATE = registerItems("enderity_chestplate", new ArmorItem(ModArmorMaterial.ENDERITY, EquipmentSlot.CHEST,  new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item ENDERITY_LEGGINGS = registerItems("enderity_leggings", new ArmorItem(ModArmorMaterial.ENDERITY, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item ENDERITY_BOOTS = registerItems("enderity_boots", new ArmorItem(ModArmorMaterial.ENDERITY, EquipmentSlot.FEET,  new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item ENDERITY_RAW_SCARP = registerItems("raw_enderity_scrap", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item ENDERITY_SCRAP = registerItems("enderity_scrap", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item DRAGONS_HEART = registerItems("dragons_heart", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item DAMAGED_ENDERITY_INGOT = registerItems("damaged_enderity_ingot", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    private static Item registerItems(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ExpandMinecraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ExpandMinecraft.LOGGER.info("Registering Mod Items");

    }
}
