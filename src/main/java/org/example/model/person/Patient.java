package org.example.model.person;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.demo.DemoUtil;
import org.example.model.Interface.IRegistrable;

public class Patient extends Person implements IRegistrable {

    private String condition;
    private static final Logger LOGGER = LogManager.getLogger(DemoUtil.class);

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
        LOGGER.info("Registering yourself in hospital");
    }

    @Override
    public void collectDocumentation() {
        LOGGER.info("Asking nurse for medical documentation");
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
