package org.example.resident;

public abstract class Staff extends Person {
    protected final static int BASE_SALARY = 3000;

    public Staff(int id, String name, String lastName, int age) {
        super(id, name, lastName, age);
    }


}
