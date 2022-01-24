package net.mcgrand.expandminecraft.enchantment;

import net.mcgrand.expandminecraft.ExpandMinecraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchantments {
    public static final Enchantment LIFE_STEAL = register("life_steal",new LifeStealEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON,EquipmentSlot.MAINHAND));

    private static Enchantment register(String name, Enchantment enchantment) {
         return Registry.register(Registry.ENCHANTMENT, new Identifier(ExpandMinecraft.MOD_ID, name),enchantment);
    }

    public static void registerEnchantments() {

        ExpandMinecraft.LOGGER.info("Registering Mod Enchantments");
    }
}
