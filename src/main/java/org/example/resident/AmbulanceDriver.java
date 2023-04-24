package org.example.resident;

import org.example.Interface.IDrivable;

public class AmbulanceDriver extends Medic implements IDrivable {

    public AmbulanceDriver(int id, String name, String lastName, int age) {
        super(id, name, lastName, age);
    }

    @Override
    String doCPR() {
        return "can't do CPR while driving";
    }

    @Override
    public void drive() {
        System.out.println("Driving an ambulance");
    }

    @Override
    public String toString() {
        return "\t\nAmbulance Driver: " +
                " id = " + id +
                " name= " + name +
                " lastName = " + lastName +
                " age = " + age ;
    }
}
