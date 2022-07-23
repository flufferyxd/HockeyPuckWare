package org.steve.hockeyware.events.client;

import net.minecraftforge.fml.common.eventhandler.Event;

public class KeyBindEvent
extends Event {
    public boolean holding;
    public boolean pressed;

    public KeyBindEvent(boolean holding, boolean pressed) {
        this.holding = holding;
        this.pressed = pressed;
    }

    public boolean isHolding() {
        return this.holding;
    }

    public boolean isPressed() {
        return this.pressed;
    }
}
