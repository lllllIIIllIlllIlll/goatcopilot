// src/mods/ModManager.java
package mods;

import java.util.ArrayList;
import java.util.List;

public class ModManager {
    private static final List<Mod> mods = new ArrayList<>();

    public static void register(Mod mod) {
        mods.add(mod);
    }
    public static List<Mod> getMods() {
        return mods;
    }
    public static Mod getMod(String name) {
        for (Mod mod : mods) if (mod.getName().equalsIgnoreCase(name)) return mod;
        return null;
    }
    public static void onTick() {
        for (Mod mod : mods) if (mod.isEnabled()) mod.onTick();
    }
    public static void onRender2D(float partialTicks) {
        for (Mod mod : mods) if (mod.isEnabled()) mod.onRender2D(partialTicks);
    }
    public static void onKey(int key, boolean pressed) {
        for (Mod mod : mods) mod.onKey(key, pressed);
    }
}