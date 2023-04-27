package org.example.place;

public class PatientRoom extends Room {

    private static final int MAX_CAPACITY = 3;


    @Override
    public String toString() {
        return "\t\n PatientRoom{" +
                "max capacity=" + MAX_CAPACITY +
                '}';
    }
}
