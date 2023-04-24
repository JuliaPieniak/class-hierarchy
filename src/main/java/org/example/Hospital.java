package org.example;

import java.util.List;
import java.util.Objects;

public class Hospital {
    private final String name;
    private final List<Department> departments;

    public Hospital(String name, List<Department> departments) {
        this.name = name;
        this.departments = departments;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hospital)) return false;
        Hospital hospital = (Hospital) o;
        return Objects.equals(name, hospital.name) && Objects.equals(departments, hospital.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, departments);
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", departments=" + departments +
                '}';
    }
}
