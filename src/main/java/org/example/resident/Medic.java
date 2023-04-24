package org.example.resident;

public abstract class Medic extends Staff {

    private int yearsOfPractice;

    public Medic(int id, String name, String lastName, int age) {
        super(id, name, lastName, age);
    }

    public int getYearsOfPractice() {
        return yearsOfPractice;
    }

    public void setYearsOfPractice(int yearsOfPractice) {
        this.yearsOfPractice = yearsOfPractice;
    }

    public double getSalary() {
        return BASE_SALARY * 3;
    }

    abstract String doCPR();

}
