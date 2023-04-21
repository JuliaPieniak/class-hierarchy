package org.example;

public abstract class Recipe {
    private String ingredient;
    private int duration;
    private String flavour;

    public Recipe(String ingredient, int duration, String flavour){
        this.ingredient = ingredient;
        this.duration = duration;
        this.flavour = flavour;
    }

    abstract void sell();


    @Override
    public String toString() {
        return "Recipe" +
                "ingredient = " + ingredient +
                ", duration = " + duration +
                ", flavour = " + flavour;
    }
}
