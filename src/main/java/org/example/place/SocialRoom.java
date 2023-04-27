package org.example.place;


public class SocialRoom extends Room {
    private final boolean availableExpress;
    int counter;

    public SocialRoom(boolean availableExpress) {
        this.availableExpress = availableExpress;
    }

    public final int countAvailableExpress(int x, int y) {
        counter = x+y;
        System.out.println("There is "+ counter+ " available express");
        return counter;
    }

    @Override
    public String toString() {
        return "SocialRoom: " +
                "available Express = " + availableExpress;
    }
}
