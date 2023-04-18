package org.example;

import java.util.ArrayList;

public class Ambulance {
    String model;
    int productionYear;

    
    public Ambulance(String model, int productionYear){
        this.model = model;
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Ambulance: " +
                "model = " + model +
                ", productionYear = " + productionYear;
    }
}
