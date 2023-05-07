package org.example.model.person;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.demo.DemoUtil;
import org.example.model.Interface.IOperable;

public class Doctor extends Medic implements IOperable {
    private final int conductedOperations;
    int docSalary;
    private static final Logger LOGGER = LogManager.getLogger(DemoUtil.class);


    public Doctor(int id, String name, String lastName, int age, int conductedOperations) {
        super(id, name, lastName, age);
        this.conductedOperations = conductedOperations;
    }


    @Override
    public double getSalary() {
        docSalary = BASE_SALARY * 3;
        LOGGER.info("Doctor salary: " + docSalary);
        return super.getSalary();
    }

    @Override
    String doCPR() {
        return "waiting for the nurse";
    }

    @Override
    public void operate() {
        LOGGER.info("Operating a patient");
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
