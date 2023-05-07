package org.example.model.person;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.demo.DemoUtil;
import org.example.exception.RestroomNotAvailableException;
import org.example.model.room.Restroom;

import java.util.Objects;

public abstract class Person {

    protected int id;
    protected String name;
    protected String lastName;
    protected int age;
    private static final Logger LOGGER = LogManager.getLogger(DemoUtil.class);


    public Person(int id, String name, String lastName, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void useRestroom(Restroom restroom) {
        try {
            restroom.use(this);
        } catch (RestroomNotAvailableException e) {
            LOGGER.info(e.getMessage());
        }
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
