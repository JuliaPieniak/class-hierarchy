package org.example.model.room;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.demo.DemoUtil;
import org.example.exception.NotEnoughExpressesException;

public class SocialRoom extends Room {
    private final boolean availableExpress;
    int counter;
    private static final Logger LOGGER = LogManager.getLogger(DemoUtil.class);


    public SocialRoom(boolean availableExpress) {
        this.availableExpress = availableExpress;
    }

    public final int countAvailableExpress(int x, int y) throws NotEnoughExpressesException {
        counter = x + y;
        if (counter > 5) {
            LOGGER.info("There is " + counter + " available express");
            return counter;
        } else {
            throw new NotEnoughExpressesException();
        }

    }

    @Override
    public String toString() {
        return "SocialRoom: " +
                "available Express = " + availableExpress;
    }
}
