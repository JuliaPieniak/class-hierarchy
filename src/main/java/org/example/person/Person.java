package org.example.person;

import java.util.Objects;

public abstract class Person {

    protected int id;
    protected String name;
    protected String lastName;
    protected int age;


    public Person(int id, String name, String lastName, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return id == person.id && age == person.age && Objects.equals(name, person.name) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, age);
    }

    @Override
    public String toString() {
        return "Person: " +
                "id = " + id +
                ", name = " + name +
                ", lastName = " + lastName +
                ", age = " + age;
    }
}
