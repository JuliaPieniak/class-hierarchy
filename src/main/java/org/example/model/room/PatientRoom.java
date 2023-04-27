package org.example.model.room;

public class PatientRoom extends Room {

    private static final int MAX_CAPACITY = 3;


    @Override
    public String toString() {
        return "\t\n PatientRoom{" +
                "max capacity=" + MAX_CAPACITY +
                '}';
    }
}
