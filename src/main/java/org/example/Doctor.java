package org.example;

public class Doctor extends MedicalStaff{
    int conductedOperations;

    public Doctor(int id, String name,String lastName, int age, int conductedOperations) {
        super(id, name, lastName, age);
        this.conductedOperations = conductedOperations;
    }

    @Override
    public String toString() {
        return "Doctor: " +
                "conductedOperations = " + conductedOperations +
                ", id = " + id +
                ", name= " + name +
                ", lastName = " + lastName +
                ", age = " + age ;
    }
}
