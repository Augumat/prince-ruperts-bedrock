package com.aug.princerupertsbedrock.enchantments;

import com.aug.princerupertsbedrock.PrinceRupertsBedrock;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchantments {

    public static Enchantment CALL_OF_THE_VOID = register("call_of_the_void", new CallOfTheVoidEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.DIGGER, new EquipmentSlot[] {EquipmentSlot.MAINHAND}));

    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registry.ENCHANTMENT, new Identifier(PrinceRupertsBedrock.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        System.out.println("Registering ModEnchantments for " + PrinceRupertsBedrock.MOD_ID);
    }

}
