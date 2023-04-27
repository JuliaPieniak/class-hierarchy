package org.example.model.room;

import org.example.exception.NotEnoughtExpressesException;

public class SocialRoom extends Room {
    private final boolean availableExpress;
    int counter;

    public SocialRoom(boolean availableExpress) {
        this.availableExpress = availableExpress;
    }

    public final int countAvailableExpress(int x, int y) throws NotEnoughtExpressesException {
        counter = x + y;
        if (counter > 5) {
            System.out.println("There is " + counter + " available express");
            return counter;
        } else {
            throw new NotEnoughtExpressesException();
        }

    }

    @Override
    public String toString() {
        return "SocialRoom: " +
                "available Express = " + availableExpress;
    }
}
