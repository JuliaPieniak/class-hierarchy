package org.example.person;

import org.example.Interface.IOperateable;

public class Doctor extends Medic implements IOperateable {
    private final int conductedOperations;
    int docSalary;

    public Doctor(int id, String name, String lastName, int age, int conductedOperations) {
        super(id, name, lastName, age);
        this.conductedOperations = conductedOperations;
    }


    @Override
    public double getSalary() {
        docSalary = BASE_SALARY * 3;
        System.out.println("Doctor salary: " + docSalary);
        return super.getSalary();
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
