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

    public static final RegistryObject<Item> TUNGSTEN = ITEMS.register("tungsten",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> MOLYBDENUM = ITEMS.register("molybdenum",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> RHENIUM = ITEMS.register("rhenium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> TECHNETIUM = ITEMS.register("technetium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> MANGANESE = ITEMS.register("manganese",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> RUTHENIUM = ITEMS.register("ruthenium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> IRIDIUM = ITEMS.register("iridium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> COBALT = ITEMS.register("cobalt",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> CARBON = ITEMS.register("carbon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> ALUMINIUM = ITEMS.register("aluminium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> GALLIUM = ITEMS.register("gallium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> INDIUM = ITEMS.register("indium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> LEAD = ITEMS.register("lead",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> SILICON = ITEMS.register("silicon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> TIN = ITEMS.register("tin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> CADMIUM = ITEMS.register("cadmium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> NICKEL = ITEMS.register("nickel",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> PALLADIUM = ITEMS.register("palladium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> PLATINUM = ITEMS.register("platinum",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> RHODIUM = ITEMS.register("rhodium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> VANADIUM = ITEMS.register("vanadium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));

    public static final RegistryObject<Item> ZINC = ITEMS.register("zinc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}


