package org.example.model.person;

import org.example.model.Interface.ITestable;

public class Support extends StaffMember implements ITestable {

    public Support(int id, String name, String lastName, int age) {
        super(id, name, lastName, age);
    }

    public double getSalary() {
        return BASE_SALARY * 2;
    }

    @Override
    public void testMachine() {
        System.out.println("Testing if machine is working");
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
