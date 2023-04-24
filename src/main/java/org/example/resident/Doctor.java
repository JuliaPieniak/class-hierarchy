package org.example.resident;

import org.example.Interface.IOperateable;

public class Doctor extends Medic implements IOperateable {
    private final int conductedOperations;

    public Doctor(int id, String name, String lastName, int age, int conductedOperations) {
        super(id, name, lastName, age);
        this.conductedOperations = conductedOperations;
    }

    @Override
    String doCPR() {
        return "waiting for the nurse";
    }

    @Override
    public void operate() {
        System.out.println("Operating a patient");
    }

    @Override
    public String toString() {
        return "\t\nDoctor: " +
                "conductedOperations = " + conductedOperations +
                ", id = " + id +
                ", name= " + name +
                ", lastName = " + lastName +
                ", age = " + age;
    }


}
