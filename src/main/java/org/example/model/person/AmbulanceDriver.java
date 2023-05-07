package org.example.model.person;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.demo.DemoUtil;
import org.example.model.Interface.IDrivable;

public class AmbulanceDriver extends Medic implements IDrivable {

    private static final Logger LOGGER = LogManager.getLogger(DemoUtil.class);

    public AmbulanceDriver(int id, String name, String lastName, int age) {
        super(id, name, lastName, age);
    }

    @Override
    String doCPR() {
        return "can't do CPR while driving";
    }

    @Override
    public void drive() {
        LOGGER.info("Driving an ambulance");
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
