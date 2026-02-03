package com.yeocci.cellcraft.fabric;

import com.yeocci.cellcraft.CellCraft;
import net.fabricmc.api.ModInitializer;

public class CellCraftFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CellCraft.init();
    }
}
