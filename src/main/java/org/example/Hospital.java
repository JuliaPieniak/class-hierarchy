package org.example;

public class Hospital {
    String name;

    public Hospital(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hospital name: " + name;
    }
}
