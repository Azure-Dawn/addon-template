package dev.gvvv.autohgw;

import dev.gvvv.autohgw.key.AutoHGWKeybind;
import dev.gvvv.autohgw.listener.KeyListener;
import net.labymod.api.addon.LabyAddon;
import net.labymod.api.client.event.EventBus;

public class AutoHGWAddon extends LabyAddon<AutoHGWConfiguration> {

    private final AutoHGWKeybind keybind = new AutoHGWKeybind();

    @Override
    protected void enable() {
        // Keybind registrieren
        this.labyAPI().eventBus().registerListener(new KeyListener(this.keybind));
    }

    @Override
    protected Class<AutoHGWConfiguration> configurationClass() {
        return AutoHGWConfiguration.class;
    }
}
