package org.example;

import java.util.Objects;

public class Parking {
    private int number;
    private boolean handicappedParking;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Parking)) return false;
        Parking parking = (Parking) o;
        return number == parking.number && handicappedParking == parking.handicappedParking;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, handicappedParking);
    }

    public Parking(int number, boolean handicappedParking){
        this.number = number;
        this.handicappedParking = handicappedParking;
    }

    @Override
    public String toString() {
        return "Parking: " +
                "number = " + number +
                ", handicappedParking = " + handicappedParking;
    }
}
