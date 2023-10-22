package net.thenextlvl.hologram.v1_20_R1;

import net.kyori.adventure.text.Component;
import net.thenextlvl.hologram.api.HologramFactory;
import net.thenextlvl.hologram.v1_20_R1.hologram.CraftBlockHologram;
import net.thenextlvl.hologram.v1_20_R1.hologram.CraftItemHologram;
import net.thenextlvl.hologram.v1_20_R1.hologram.CraftTextHologram;
import org.bukkit.Location;
import org.bukkit.block.data.BlockData;
import org.bukkit.inventory.ItemStack;

public class CraftHologramFactory implements HologramFactory {
    @Override
    public CraftTextHologram createHologram(Location location, Component text) {
        return new CraftTextHologram(location, text);
    }

    @Override
    public CraftBlockHologram createHologram(Location location, BlockData block) {
        return new CraftBlockHologram(location, block);
    }

    @Override
    public CraftItemHologram createHologram(Location location, ItemStack itemStack) {
        return new CraftItemHologram(location, itemStack);
    }
}
