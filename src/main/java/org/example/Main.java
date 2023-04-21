package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Department department1 = new Department("Infectious");
        Department department2 = new Department("Kids");
        Department department3 = new Department("OIOM");
        Department department4 = new Department("Almost healthy");

        List<Department> departments1 = new ArrayList<>(Arrays.asList(department1, department2, department3));
        List<Department> departments2 = new ArrayList<>(Arrays.asList(department4));


        Hospital hospital1 = new Hospital("Mayo Clinic in Rochester", departments1);
        Hospital hospital2 = new Hospital("Mayo Clinic in Rochester", departments2);


        Labolatory labolatory1 = new Labolatory(1200);
        Labolatory labolatory2 = new Labolatory(1200);

        Person person1 = new Person(1, "Denny", "Targ", 25);
        Person person2 = new Person(1, "Denny", "Targ", 25);
        Patient patient = new Patient(2, "Rick", "Sanchez", 70);
        patient.setCondition("Headache");

        MedicalStaff medicalStaff = new MedicalStaff(3, "Sarah", "Cameron", 52);
        medicalStaff.setYearsOfPractice(5);
        Support support = new Support("cleaning", "Cleaner");
        Nurse nurse = new Nurse(4, "Joe", "Goldberg", 32, 73);
        Doctor doctor = new Doctor(5, "Bruce", "Wayne", 46, 40);

        SocialRoom socialRoom = new SocialRoom(true);
        Bathroom bathroom = new Bathroom(true);
        PatientRoom patientRoom = new PatientRoom(4);

        Ambulance ambulance1 = new Ambulance("Volvo", 1992);
        Ambulance ambulance2 = new Ambulance("Volvo", 1992);
        Parking parking1 = new Parking(13, true);
        Parking parking2 = new Parking(13, true);

        Equipment equipment1 = new Equipment(2);
        Equipment equipment2 = new Equipment(2);
        Pill pill = new Pill("Paracetamol + Ibuprofen", 3, "strawberry");
        pill.sell();


        System.out.println(hospital1);
        System.out.println(hospital2);
        System.out.println(department1);
        System.out.println(department2);
        System.out.println(labolatory1);
        System.out.println(labolatory2);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(patient);
        System.out.println(medicalStaff);
        System.out.println(support);
        System.out.println(nurse);
        System.out.println(doctor);
        System.out.println(socialRoom);
        System.out.println(bathroom);
        System.out.println(patientRoom);
        System.out.println(ambulance1);
        System.out.println(ambulance2);
        System.out.println(parking1);
        System.out.println(parking2);
        System.out.println(equipment1);
        System.out.println(equipment2);
        System.out.println(pill);

        System.out.println("----------------------------------------------------------------------------");

        //equals() check
        System.out.println("Are laboratories with matching parameters equal? (with override)");
        System.out.println(labolatory1.equals(labolatory2));
        System.out.println("Are people with matching parameters equal? (with override)");
        System.out.println(person1.equals(person2));
        System.out.println("Are ambulances with matching parameters equal? (with override)");
        System.out.println(ambulance1.equals(ambulance2));
        System.out.println("Are parking's with matching parameters equal? (with override)");
        System.out.println(parking1.equals(parking2));
        System.out.println("Are equipments with matching parameters equal? (without override)");
        System.out.println(equipment1.equals(equipment2));

        System.out.println("----------------------------------------------------------------------------");

        //hashcode check

        checkHashCodes(labolatory1, labolatory1);

        checkHashCodes(person1, person2);

        checkHashCodes(ambulance1, ambulance2);

        checkHashCodes(parking1, parking2);

        checkHashCodes(equipment1, equipment2);

        System.out.println(".....................................");
        System.out.println("Hashcode for objects  type of: [org.example.Hospital] - without matching parameters:");
        System.out.println(hospital1.hashCode());
        System.out.println(hospital2.hashCode());

    }

    public static void checkHashCodes(Object o1, Object o2) {
        System.out.println(".....................................");
        String className = o1.getClass().getName();
        System.out.println("Hashcode for objects  type of: [" + className + "] - with matching parameters:");
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());

    }
}