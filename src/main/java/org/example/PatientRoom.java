package org.example;

public class PatientRoom{

   private int capacity;


    public PatientRoom(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "PatientRoom: " +
                "capacity = " + capacity;
    }
}
