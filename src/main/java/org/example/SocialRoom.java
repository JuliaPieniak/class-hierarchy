package org.example;


public class SocialRoom {
    boolean availableExpress;


    public SocialRoom(boolean availableExpress) {
        this.availableExpress = availableExpress;
    }

    @Override
    public String toString() {
        return "SocialRoom: " +
                "available Express = " + availableExpress;
    }
}
