package org.example.place;


public class SocialRoom extends Room {
    private final boolean availableExpress;


    public SocialRoom(boolean availableExpress) {
        this.availableExpress = availableExpress;
    }


    @Override
    public String toString() {
        return "SocialRoom: " +
                "available Express = " + availableExpress;
    }
}
