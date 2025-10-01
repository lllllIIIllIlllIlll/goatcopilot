package mods;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;

// Shows player's armor durability/status on HUD
public class ModArmorStatus extends Mod {
    public ModArmorStatus() { super("Armor Status"); }
    @Override
    public void onRender2D(float partialTicks) {
        // TODO: Draw armor slots and durability bars using Minecraft inventory data.
    }
}