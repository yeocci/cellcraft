package com.yeocci.cellcraft;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.core.registries.Registries;

public class CellCraft {
    public static final String MOD_ID = "cellcraft";

    // Example Block
    public static Block CELL_BLOCK;
    
    // Example Item
    public static Item CELL_BLOCK_ITEM;

    public static void init() {
        // Register block
        CELL_BLOCK = Registry.register(
            BuiltInRegistries.BLOCK,
            new ResourceLocation(MOD_ID, "cell_block"),
            new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK))
        );
        
        // Register item
        CELL_BLOCK_ITEM = Registry.register(
            BuiltInRegistries.ITEM,
            new ResourceLocation(MOD_ID, "cell_block"),
            new BlockItem(CELL_BLOCK, new Item.Properties())
        );
        
        System.out.println("CellCraft mod initialized!");
    }
}
