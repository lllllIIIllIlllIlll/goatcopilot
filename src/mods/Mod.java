// src/mods/Mod.java
package mods;

public abstract class Mod {
    protected String name;
    protected boolean enabled = false;

    public Mod(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }

    // Called every game tick
    public void onTick() {}

    // Called every frame to draw overlays
    public void onRender2D(float partialTicks) {}

    // Called to handle keybinds
    public void onKey(int key, boolean pressed) {}

    // Save/load settings
    public void saveConfig() {}
    public void loadConfig() {}
}