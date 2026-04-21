package dev.gvvv.autohgw.listener;

import net.labymod.api.event.Subscribe;
import net.labymod.api.event.client.input.KeyEvent;
import net.labymod.api.Laby;
import net.labymod.api.client.world.ClientWorld;

import dev.gvvv.autohgw.key.AutoHGWKeybind;

public class KeyListener {

    private final AutoHGWKeybind keybind;

    public KeyListener(AutoHGWKeybind keybind) {
        this.keybind = keybind;
    }

    @Subscribe
    public void onKey(KeyEvent event) {
        if (!event.isPressed()) return;
        if (!this.keybind.isPressed()) return;

        ClientWorld world = Laby.labyAPI().minecraft().getClientWorld();
        if (world == null) return;

        Laby.labyAPI().minecraft().chatExecutor().chat("HGW");
    }
}
