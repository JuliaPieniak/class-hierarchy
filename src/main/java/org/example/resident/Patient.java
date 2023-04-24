package org.example.resident;

import org.example.Interface.IRegistrable;

public class Patient extends Person implements IRegistrable {

    private String condition;

    public Patient(int id, String name, String lastName, int age) {
        super(id, name, lastName, age);
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public void register() {
        System.out.println("Registering yourself in hospital");
    }

    @Override
    public void collectDocumentation() {
        System.out.println("Asking nurse for medical documentation");
    }

    @Override
    public String toString() {
        return "\t\nPatient: " +
                "condition = " + condition +
                ", id = " + id +
                ", name = " + name +
                ", lastName = " + lastName +
                ", age = " + age;
    }


}
