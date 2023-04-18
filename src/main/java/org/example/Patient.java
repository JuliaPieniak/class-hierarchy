package org.example;

public class Patient extends Person{
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
    public String toString() {
        return "Patient: " +
                "condition = " + condition +
                ", id = " + id +
                ", name = " + name +
                ", lastName = " + lastName +
                ", age = " + age;
    }
}
