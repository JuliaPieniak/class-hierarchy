package org.example.model.person;

import org.example.model.Interface.IAssistable;

public class Nurse extends Medic implements IAssistable {
    private final int conductedAssist;

    public Nurse(int id, String name, String lastName, int age, int conductedAssist) {
        super(id, name, lastName, age);
        this.conductedAssist = conductedAssist;
    }

    @Override
    String doCPR() {
        return "CPR done";
    }

    @Override
    public String toString() {
        return "\t\nNurse: " +
                "conductedAssist = " + conductedAssist +
                " id = " + id +
                " name = " + name +
                " lastName = " + lastName +
                " age = " + age;
    }

    @Override
    public void assist() {
        System.out.println("Assisting in operation");
    }
}
