package org.example.model;

import org.example.model.enums.DepartmentType;
import org.example.model.person.Patient;
import org.example.model.person.StaffMember;

import java.util.List;

public class Department {

    private final DepartmentType type;
    private final List<Ambulance> ambulances;
    private final List<StaffMember> staffMembers;
    private final List<Patient> patients;

    public Department(DepartmentType type, List<Ambulance> ambulances, List<StaffMember> staffMembers, List<Patient> patients) {
        this.type = type;
        this.ambulances = ambulances;
        this.staffMembers = staffMembers;
        this.patients = patients;
    }

    public void addAmbulance(Ambulance ambulance) {
        ambulances.add(ambulance);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addStaffMember(StaffMember staffMember) {
        staffMembers.add(staffMember);
    }

    public DepartmentType getType() {
        return type;
    }

    public List<StaffMember> getStaffMembers() {
        return staffMembers;
    }

    @Override
    public String toString() {
        return "\n\tDepartment {" +
                "\ntype=" + type +
                "\nambulances=" + ambulances +
                "\nstaffs=" + staffMembers +
                "\npatients=" + patients +
                "\n}";
    }


}
