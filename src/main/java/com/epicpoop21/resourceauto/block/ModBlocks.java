package com.epicpoop21.resourceauto.block;

import com.epicpoop21.resourceauto.ResourceAuto;
import com.epicpoop21.resourceauto.item.ModCreativeModeTab;
import com.epicpoop21.resourceauto.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ResourceAuto.MOD_ID);

    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.RESOURCEAUTO_TAB);

    public static final RegistryObject<Block> ELEMENTAL_ORE = registerBlock("elemental_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.RESOURCEAUTO_TAB);

    public static final RegistryObject<Block> ELEMENTAL_ORE_1 = registerBlock("elemental_ore_1",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.RESOURCEAUTO_TAB);

    public static final RegistryObject<Block> ELEMENTAL_ORE_2 = registerBlock("elemental_ore_2",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.RESOURCEAUTO_TAB);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name, toReturn, tab );
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block,CreativeModeTab tab) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModeTab.RESOURCEAUTO_TAB)));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
