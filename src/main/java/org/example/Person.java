package org.example;

public class Person {

    protected int id;
    protected String name;
    protected String lastName;
    protected int age;


    public Person(int id, String name, String lastName, int age){
        this.id = id;
        this.name = name;
        this.age = age;
        this.lastName = lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setlastName( String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getlastName() {
        return lastName;
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
