package org.example;

import org.example.place.Bathroom;
import org.example.place.SocialRoom;
import org.example.person.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        AmbulanceDriver ambulanceDriver1 = new AmbulanceDriver(1, "Joe", "Goldberg", 45);
        AmbulanceDriver ambulanceDriver2 = new AmbulanceDriver(2, "Sam", "Smith", 54);
        Nurse nurse1 = new Nurse(4, "Joe", "Goldberg", 32, 73);
        Doctor doctor1 = new Doctor(3, "Sarah", "Cameron", 52, 76);
        Support support1 = new Support(5, "Bruce", "Wayne", 43);
        List<Staff> staffs1 = new ArrayList<>(List.of(ambulanceDriver1, ambulanceDriver2, nurse1, doctor1, support1));


        Ambulance ambulance1 = new Ambulance("Toyota", 1999);
        Ambulance ambulance2 = new Ambulance("abd", 2001);
        Ambulance ambulance3 = new Ambulance("cde", 1992);
        List<Ambulance> ambulances1 = new ArrayList<>(List.of(ambulance1, ambulance2));
        List<Ambulance> ambulances2 = new ArrayList<>(List.of(ambulance3));

        Patient patient1 = new Patient(9, "Denny", "Targ", 15);
        Patient patient2 = new Patient(10, "Rick", "Sanchez", 70);
        Patient patient3 = new Patient(11, "Andrew", "Globerman", 20);
        Patient patient4 = new Patient(11, "Ned", "Stark", 57);
        patient1.setCondition("Headache");
        patient2.setCondition("Stomach hurts");
        patient3.setCondition("Pukes");
        patient4.setCondition("Spine injured");
        List<Patient> patients1 = new ArrayList<>(List.of(patient2, patient3));
        List<Patient> patients2 = new ArrayList<>(List.of(patient1));
        List<Patient> patients3 = new ArrayList<>(List.of(patient4));


        Department department1 = new Department("Infectious", ambulances1, staffs1, patients1);
        Department department2 = new Department("Kids", ambulances1, staffs1, patients2);
        Department department3 = new Department("OIOM", ambulances2, staffs1, patients3);


        List<Department> departments1 = new ArrayList<>(List.of(department1, department2));
        List<Department> departments2 = new ArrayList<>(List.of(department3));

        SocialRoom socialRoom = new SocialRoom(true);
        socialRoom.countAvailableExpress(3, 2);

        Hospital hospital1 = new Hospital("Mayo Clinic in Rochester", departments1);
        System.out.println(hospital1);

        Bathroom.display();
        doctor1.getSalary();

        ////////////////////////////////////////////
//        Labolatory labolatory1 = new Labolatory(1200);
//        Labolatory labolatory2 = new Labolatory(1200);
//
//
//        SocialRoom socialRoom = new SocialRoom(true);
//        Bathroom bathroom = new Bathroom(true);


//        System.out.println(department1);
//        System.out.println(department2);
//        System.out.println(labolatory1);
//        System.out.println(labolatory2);
//        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(patient);
//        System.out.println(doctor1);
//        System.out.println(nurse);
//        System.out.println(socialRoom);
//        System.out.println(bathroom);
//        System.out.println(patientRoom);
//        System.out.println(ambulance1);
//        System.out.println(ambulance2);


//        System.out.println("----------------------------------------------------------------------------");
//
//        //equals() check
//        System.out.println("Are laboratories with matching parameters equal? (with override)");
//        System.out.println(labolatory1.equals(labolatory2));
// //       System.out.println("Are people with matching parameters equal? (with override)");
// //       System.out.println(person1.equals(person2));
//        System.out.println("Are ambulances with matching parameters equal? (with override)");
//        System.out.println(ambulance1.equals(ambulance2));
//        System.out.println("Are parking's with matching parameters equal? (with override)");
//
//
//        System.out.println("----------------------------------------------------------------------------");
//
//        //hashcode check
//
//        checkHashCodes(labolatory1, labolatory1);
//
// //       checkHashCodes(person1, person2);
//
//        checkHashCodes(ambulance1, ambulance2);


//        System.out.println(".....................................");
//        System.out.println("Hashcode for objects  type of: [org.example.Hospital] - without matching parameters:");
//        System.out.println(hospital1.hashCode());
//        System.out.println(hospital2.hashCode());

    }

    static {
        System.out.println("Static Block");
    }

//    public static void checkHashCodes(Object o1, Object o2) {
//        System.out.println(".....................................");
//        String className = o1.getClass().getName();
//        System.out.println("Hashcode for objects  type of: [" + className + "] - with matching parameters:");
//        System.out.println(o1.hashCode());
//        System.out.println(o2.hashCode());
//
//    }
}