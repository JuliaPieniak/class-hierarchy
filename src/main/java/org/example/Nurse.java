package org.example;

public class Nurse extends MedicalStaff{
    int conductedAssist;

    public Nurse(int id, String name,String lastName, int age, int conductedAssist) {
        super(id, name, lastName, age);
        this.conductedAssist = conductedAssist;
    }

    @Override
    public String toString() {
        return "Nurse: " +
                "conductedAssist = " + conductedAssist +
                ", id = " + id +
                ", name = " + name+
                ", lastName = " + lastName +
                ", age = " + age;
    }
}
