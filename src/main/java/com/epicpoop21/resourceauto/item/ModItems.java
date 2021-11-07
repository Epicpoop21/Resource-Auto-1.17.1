package com.epicpoop21.resourceauto.item;

import com.epicpoop21.resourceauto.ResourceAuto;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ResourceAuto.MOD_ID);

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> SCANDIUM = ITEMS.register("scandium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> YTTRIUM = ITEMS.register("yttrium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> TITANIUM = ITEMS.register("titanium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> ZIRCONIUM = ITEMS.register("zirconium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> HAFNIUM = ITEMS.register("hafnium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> CHROMIUM = ITEMS.register("chromium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> NIOBIUM = ITEMS.register("niobium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> TANTALUM = ITEMS.register("tantalum",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}


