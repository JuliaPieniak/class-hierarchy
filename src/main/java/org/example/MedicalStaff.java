package org.example;

public class MedicalStaff extends Person {
    private int yearsOfPractice;

    public MedicalStaff(int id, String name, String lastName, int age) {
        super(id, name, lastName, age);
    }

    public int getYearsOfPractice() {
        return yearsOfPractice;
    }

    public void setYearsOfPractice(int yearsOfPractice) {
        this.yearsOfPractice = yearsOfPractice;
    }

    @Override
    public String toString() {
        return "MedicalStaff: " +
                "yearsOfPractice = " + yearsOfPractice +
                ", id = " + id +
                ", name= " + name +
                ", lastName = " + lastName +
                ", age = " + age;
    }
}
