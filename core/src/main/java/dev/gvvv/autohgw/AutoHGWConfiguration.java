package dev.gvvv.autohgw;

import net.labymod.api.configuration.loader.annotation.ConfigName;
import net.labymod.api.configuration.loader.property.ConfigProperty;
import net.labymod.api.configuration.LabyConfig;

@ConfigName("settings")
public class AutoHGWConfiguration extends LabyConfig {

    @ConfigProperty
    private boolean enabled = true;

    public boolean isEnabled() {
        return enabled;
    }
}
