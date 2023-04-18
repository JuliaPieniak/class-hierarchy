package org.example;

public class Parking {
    int number;
    boolean handicappedParking;

    public Parking( int number, boolean handicappedParking){
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
