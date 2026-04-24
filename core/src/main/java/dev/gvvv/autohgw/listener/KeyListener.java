package dev.gvvv.autohgw.listener;

import dev.gvvv.autohgw.key.AutoHGWKeybind;
import net.labymod.api.client.event.keyboard.KeyEvent;
import net.labymod.api.event.Subscribe;

public class KeyListener {

    private final AutoHGWKeybind keybind;

    public KeyListener(AutoHGWKeybind keybind) {
        this.keybind = keybind;
    }

    @Subscribe
    public void onKey(KeyEvent event) {

        // Neue API: check ob Taste gedrückt wurde
        if (event.action() != KeyEvent.Action.PRESS) {
            return;
        }

        // Prüfen ob unser Keybind gedrückt wurde
        if (event.key() != keybind.getDefaultKey()) {
            return;
        }

        // 👉 Hier kommt dein Feature rein
        System.out.println("AutoHGW aktiviert!");
    }
}
