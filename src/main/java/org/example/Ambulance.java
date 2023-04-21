package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class Ambulance {
    private String model;
    private int productionYear;

    public Ambulance(String model, int productionYear){
        this.model = model;
        this.productionYear = productionYear;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ambulance)) return false;
        Ambulance ambulance = (Ambulance) o;
        return productionYear == ambulance.productionYear && Objects.equals(model, ambulance.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, productionYear);
    }



    @Override
    public String toString() {
        return "Ambulance: " +
                "model = " + model +
                ", productionYear = " + productionYear;
    }
}
