package org.example;

import org.example.resident.Patient;
import org.example.resident.Staff;

import java.util.List;

public class Department {

    private final String name;
    private final List<Ambulance> ambulances;
    private final List<Staff> staffs;
    private final List<Patient> patients;

    public Department(String name, List<Ambulance> ambulances, List<Staff> staffs, List<Patient> patients) {
        this.name = name;
        this.ambulances = ambulances;
        this.staffs = staffs;
        this.patients = patients;
    }

    public void addAmbulance(Ambulance ambulance) {
        ambulances.add(ambulance);
    }

    @Override
    public String toString() {
        return "\t\nDepartment{" +
                "\t\nname=" + name + '\'' +
                "\t\nambulances=" + ambulances +
                "\t\nstaffs=" + staffs +
                "\t\npatients=" + patients;
    }
}
