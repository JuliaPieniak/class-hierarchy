package org.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Info {
    public final int MIN_MANAGER_AGE = 35;
    private static final Logger LOGGER = LogManager.getLogger(DemoUtil.class);


    void show() {
        LOGGER.info(MIN_MANAGER_AGE);
    }
}
