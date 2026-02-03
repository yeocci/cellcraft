package com.yeocci.cellcraft;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.item.BlockItem;

public class CellCraft {
    public static final String MOD_ID = "cellcraft";

    // Registries
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registries.BLOCK);
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(MOD_ID, Registries.CREATIVE_MODE_TAB);

    // Example Block
    public static final RegistrySupplier<Block> CELL_BLOCK = BLOCKS.register("cell_block", () ->
        new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    
    // Example Item
    public static final RegistrySupplier<Item> CELL_BLOCK_ITEM = ITEMS.register("cell_block", () ->
        new BlockItem(CELL_BLOCK.get(), new Item.Properties()));

    // Creative Tab
    public static final RegistrySupplier<CreativeModeTab> CELLCRAFT_TAB = TABS.register("cellcraft_tab", () ->
        CreativeTabRegistry.create(
            Component.translatable("itemGroup." + MOD_ID),
            () -> new ItemStack(CELL_BLOCK.get())
        ));

    public static void init() {
        BLOCKS.register();
        ITEMS.register();
        TABS.register();
        
        System.out.println("CellCraft mod initialized!");
    }
}
