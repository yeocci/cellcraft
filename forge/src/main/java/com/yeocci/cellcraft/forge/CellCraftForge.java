package com.yeocci.cellcraft.forge;

import com.yeocci.cellcraft.CellCraft;
import net.minecraftforge.fml.common.Mod;

@Mod(CellCraft.MOD_ID)
public class CellCraftForge {
    public CellCraftForge() {
        CellCraft.init();
    }
}
