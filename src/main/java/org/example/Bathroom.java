package org.example;

public class Bathroom{

    private boolean isClean;


    public Bathroom(boolean isClean) {
        this.isClean = isClean;
    }

    @Override
    public String toString() {
        return "Bathroom: " +
                "isClean = " + isClean;
    }
}
