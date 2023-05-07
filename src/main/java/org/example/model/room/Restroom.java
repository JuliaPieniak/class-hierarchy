package org.example.model.room;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.demo.DemoUtil;
import org.example.exception.RestroomIsUsedByOtherPersonException;
import org.example.exception.RestroomNotAvailableException;
import org.example.model.person.Person;

public class Restroom extends Room {

    private boolean isAvailable;
    private Person user;
    private static final Logger LOGGER = LogManager.getLogger(DemoUtil.class);


    public Restroom(boolean available) {
        this.isAvailable = available;
    }

    public static void display() {
        LOGGER.info("Bathroom displayed");
    }

    public void use(Person person) throws RestroomNotAvailableException {
        if(isAvailable){
            this.user = person;
            setAvailable(false);
        } else{
            throw new RestroomNotAvailableException();
        }
    }

    public void free(Person person) throws RestroomIsUsedByOtherPersonException {
        if(person.equals(user)){
            user = null;
            setAvailable(true);
        } else {
            throw new RestroomIsUsedByOtherPersonException();
        }
    }

    private void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Bathroom: " +
                "is free = " + isAvailable;
    }
}
