package org.example.place;

public class Bathroom extends Room {

    private final boolean isClean;


    public Bathroom(boolean isClean) {
        this.isClean = isClean;
    }

    @Override
    public String toString() {
        return "Bathroom: " +
                "isClean = " + isClean;
    }
}
