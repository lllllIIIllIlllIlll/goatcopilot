// src/mods/ModNoParticle.java
package mods;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EffectRenderer;

/**
 * Disables or greatly reduces the number of particles for FPS improvement.
 */
public class ModNoParticle extends Mod {
    public ModNoParticle() {
        super("No Particle");
    }

    @Override
    public void onTick() {
        if (!enabled) return;
        Minecraft mc = Minecraft.getMinecraft();
        EffectRenderer effectRenderer = mc.effectRenderer;
        if (effectRenderer != null) {
            // Remove all particles
            effectRenderer.getEffects().clear();
        }
    }
}