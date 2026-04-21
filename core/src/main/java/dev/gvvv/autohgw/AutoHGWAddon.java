package dev.gvvv.autohgw;

import net.labymod.api.addon.LabyAddon;
import net.labymod.api.models.addon.annotation.AddonMain;
import dev.gvvv.autohgw.key.AutoHGWKeybind;
import dev.gvvv.autohgw.listener.KeyListener;

@AddonMain
public class AutoHGWAddon extends LabyAddon {

    private AutoHGWKeybind keybind;

    @Override
    protected void enable() {
        this.keybind = new AutoHGWKeybind();
        this.labyAPI().keybindService().registerKeyBinding(this.keybind);
        this.registerListener(new KeyListener(this.keybind));
    }

    @Override
    protected void disable() {}
}
