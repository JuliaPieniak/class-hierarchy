package org.example.model.person;

public abstract class StaffMember extends Person {
    protected final static int BASE_SALARY = 3000;

    public StaffMember(int id, String name, String lastName, int age) {
        super(id, name, lastName, age);
    }



}
