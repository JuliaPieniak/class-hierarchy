package org.example.model.person;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.demo.DemoUtil;
import org.example.model.Interface.ITestable;

public class Support extends StaffMember implements ITestable {
    private static final Logger LOGGER = LogManager.getLogger(DemoUtil.class);


    public Support(int id, String name, String lastName, int age) {
        super(id, name, lastName, age);
    }

    public double getSalary() {
        return BASE_SALARY * 2;
    }

    @Override
    public void testMachine() {
        LOGGER.info("Testing if machine is working");
    }

    @Override
    public String toString() {
        return "\t\nSupport: " +
                ", id = " + id +
                ", name= " + name +
                ", lastName = " + lastName +
                ", age = " + age;
    }
}
