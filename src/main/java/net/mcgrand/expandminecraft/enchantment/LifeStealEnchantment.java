package net.mcgrand.expandminecraft.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;

import java.util.Random;

public class LifeStealEnchantment extends Enchantment {
    public LifeStealEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot... slotTypes) {
        super(weight, type, slotTypes);
    }
    PlayerEntity test;
    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(!user.world.isClient()){
            ServerWorld world = ((ServerWorld) user.world);
            PlayerEntity player = ((PlayerEntity) user);

            if(level == 1) {
                Random rand = new Random();
                if(rand.nextInt(1,10) == 2){
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH,1,1),player);
                }
            }else if(level == 2) {
                Random rand = new Random();
                if(rand.nextInt(1,7) == 2){
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH,1,1),player);
            }
        }

            super.onTargetDamaged(user, target, level);
        }
    }
    @Override
    public int getMinPower(int level) {
        return 1 + 10 * (level - 1);
    }

    @Override
    public int getMaxPower(int level) {
        return super.getMinPower(level) + 50;
    }

    

    @Override
    public int getMaxLevel() {
        return 2;
    }
}
