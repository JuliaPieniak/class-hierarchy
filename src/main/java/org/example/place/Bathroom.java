package org.example.place;

public class Bathroom extends Room {

    private final boolean isClean;


    public Bathroom(boolean isClean) {
        this.isClean = isClean;
    }

    public static void display() {
        System.out.println("Bathroom displayed");
    }

    @Override
    public String toString() {
        return "Bathroom: " +
                "isClean = " + isClean;
    }
}
