package org.example.place;

import org.example.resident.Patient;

import java.util.List;

public class PatientRoom extends Room {

    private final int capacity;
    private final List<Patient> patients;


    public PatientRoom(int capacity, List<Patient> patients) {
        this.capacity = capacity;
        this.patients = patients;
    }

    @Override
    public String toString() {
        return "PatientRoom{" +
                "capacity=" + capacity +
                ", patients=" + patients +
                '}';
    }
}
