package com.fireflyyun.testmod.item;


import com.fireflyyun.testmod.TestMod;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item ICE_ETHER = registerItems("ice_ether", new Item(new Item.Settings()));

    public static Item registerItems(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TestMod.MOD_ID, id), item);
    }

    public static void registerModItems() {
        TestMod.LOGGER.info("Registering ModItems");
    }
}
