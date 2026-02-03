package com.yeocci.cellcraft.forge;

import com.yeocci.cellcraft.CellCraft;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CellCraft.MOD_ID)
public class CellCraftForge {
    public CellCraftForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(CellCraft.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        
        CellCraft.init();
    }
}
