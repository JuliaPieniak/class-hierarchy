package org.example;

public class Pill extends Recipe{


    public Pill(String ingredient, int duration, String flavour) {
        super(ingredient, duration, flavour);
    }

    @Override
    void sell() {
        System.out.println("The pill was sold!");
    }

}
