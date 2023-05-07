package org.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.exception.NotEnoughtExpressesException;
import org.example.exception.TooBigIndexException;
import org.example.model.Ambulance;
import org.example.model.Department;
import org.example.model.Hospital;
import org.example.model.enums.DepartmentType;
import org.example.model.person.*;
import org.example.model.room.Restroom;
import org.example.model.room.SocialRoom;

import java.util.*;

public class DemoUtil {

    private static Hospital hospitalState;
    private static int personID = -1;
    private static final Logger LOGGER = LogManager.getLogger(DemoUtil.class);


    private final static List<String> names = new ArrayList<>(List.of("John", "Joe", "Sam", "Kat", "Carly"));
    private final static List<String> lastNames = new ArrayList<>(List.of("Smith", "Bond", "Kowalski", "Dimmer", "Wazowsky"));


    public static Hospital getHospitalState() {
        return hospitalState;
    }

    public static int readIndex(int numberOfOptions) throws TooBigIndexException {
        Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            int index = Integer.parseInt(line);
            if (index >= numberOfOptions) {
                throw new TooBigIndexException();
            }
            return index;
    }

    public static void showDepartmentsSimple() {
        List<Department> departments = hospitalState.getDepartments();
        for (int i = 0; i < departments.size(); i++) {
            LOGGER.info((i) + ". " + departments.get(i).getType());
        }
    }

    public static void addPatient() {
        showDepartmentsSimple();

        int index;
        try {
            index = readIndex(hospitalState.getDepartments().size());
        } catch (Exception e) {
            LOGGER.info(e.getMessage());
            return;
        }

        Patient patient = createRandomPatient();
        Department department = hospitalState.getDepartments().get(index);
        department.addPatient(patient);

        LOGGER.info("Patient '" + patient.getName() + " " + patient.getLastName() + "' added to '" + department.getType() + "'");
    }

    public static void addDoctor() {
        Doctor doctor = createRandomDoctor();
        addStaffMember(doctor);
    }

    public static void addStaffMember(StaffMember staffMember) {
        showDepartmentsSimple();

        int index;
        try {
            index = readIndex(hospitalState.getDepartments().size());
        } catch (Exception e) {
            LOGGER.info(e.getMessage());
            return;
        } finally {
            LOGGER.info("OK");
        }

        Department department = hospitalState.getDepartments().get(index);
        department.addStaffMember(staffMember);

        LOGGER.info(staffMember.getClass().getName() + " '" + staffMember.getName() + " " + staffMember.getLastName() + "' added to '" + department.getType() + "'");
    }

    public static Doctor createRandomDoctor() {
        String randomName = getRandom(names);
        String randomLastName = getRandom(lastNames);
        int randomAge = ((int) (Math.random() * 100)) + 1;
        int randomNumberOfConductedOperations = ((int) (Math.random() * 30)) + 1;

        Doctor doctor = new Doctor(++personID, randomName, randomLastName, randomAge, randomNumberOfConductedOperations);
        LOGGER.info("Created -> " + doctor);

        return doctor;
    }

    public static Patient createRandomPatient() {
        String randomName = getRandom(names);
        String randomLastName = getRandom(lastNames);
        int randomAge = ((int) (Math.random() * 100)) + 1;

        Patient patient = new Patient(++personID, randomName, randomLastName, randomAge);
        LOGGER.info("Created -> " + patient);

        return patient;
    }

    public static <T> T getRandom(List<T> list) {
        return list.get((int) (Math.random() * list.size()));
    }

    public static void countExpress() throws NotEnoughtExpressesException {
        SocialRoom socialRoom = new SocialRoom(true);
        socialRoom.countAvailableExpress(3, 2);
    }

    public static void initHospitalState() {

        AmbulanceDriver ambulanceDriver1 = new AmbulanceDriver(++personID, "Joe", "Goldberg", 45);
        AmbulanceDriver ambulanceDriver2 = new AmbulanceDriver(++personID, "Sam", "Smith", 54);
        Nurse nurse1 = new Nurse(++personID, "Joe", "Goldberg", 32, 73);
        Doctor doctor1 = new Doctor(++personID, "Sarah", "Cameron", 52, 76);
        Support support1 = new Support(++personID, "Bruce", "Wayne", 43);
        List<StaffMember> staffMembers1 = new ArrayList<>(List.of(ambulanceDriver1, ambulanceDriver2, nurse1));
        List<StaffMember> staffMembers2 = new ArrayList<>(List.of(doctor1, support1));


        Ambulance ambulance1 = new Ambulance("Toyota", 1999);
        Ambulance ambulance2 = new Ambulance("abd", 2001);
        Ambulance ambulance3 = new Ambulance("cde", 1992);
        Ambulance ambulance4 = new Ambulance("fgh", 1993);
        List<Ambulance> ambulances1 = new ArrayList<>(List.of(ambulance1, ambulance2));
        List<Ambulance> ambulances2 = new ArrayList<>(List.of(ambulance3));
        List<Ambulance> ambulances3 = new ArrayList<>(List.of(ambulance4));

        Patient patient1 = new Patient(++personID, "Denny", "Targ", 15);
        Patient patient2 = new Patient(++personID, "Rick", "Sanchez", 70);
        Patient patient3 = new Patient(++personID, "Andrew", "Globerman", 20);
        Patient patient4 = new Patient(++personID, "Ned", "Stark", 57);
        patient1.setCondition("Headache");
        patient2.setCondition("Stomach hurts");
        patient3.setCondition("Pukes");
        patient4.setCondition("Spine injured");
        List<Patient> patients1 = new ArrayList<>(List.of(patient2, patient3));
        List<Patient> patients2 = new ArrayList<>(List.of(patient1));
        List<Patient> patients3 = new ArrayList<>(List.of(patient4));


        Department department1 = new Department(DepartmentType.CARDIOLOGY, ambulances1, staffMembers1, patients1);
        Department department2 = new Department(DepartmentType.NEUROLOGY, ambulances2, staffMembers2, patients2);
//        Department department3 = new Department(DepartmentType.ONCOLOGY, ambulances3, staffMembers1, patients3);


        LinkedList<Department> departments = new LinkedList<>(List.of(department1, department2));

        SocialRoom socialRoom = new SocialRoom(true);
        //socialRoom.countAvailableExpress(3, 2);

        HashMap<String, String> coffeeMachines = new HashMap<>();
        coffeeMachines.put("Krups", "Espresso Machine");
        coffeeMachines.put("Nespresso", "VertuoPlus");
        coffeeMachines.put("DeLonghi", "Dinamica");
        coffeeMachines.put("Breville", "Bambino Plus");
        LOGGER.info("Size of coffee machines HashMap: " + coffeeMachines.size());

        Hospital hospital1 = new Hospital("Mayo Clinic in Rochester", departments);


        Restroom.display();
        doctor1.getSalary();

        Restroom restroom1 = new Restroom(true);
        Restroom restroom2 = new Restroom(false);
        patient1.useRestroom(restroom2);
        patient1.useRestroom(restroom1);


        hospitalState = hospital1;
    }

/*
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
//        System.out.println("Hashcode for objects  type of: [org.example.model.Hospital] - without matching parameters:");
//        System.out.println(hospital1.hashCode());
//        System.out.println(hospital2.hashCode());

*/

/*
   public static void checkHashCodes(Object o1, Object o2) {
        System.out.println(".....................................");
        String className = o1.getClass().getName();
        System.out.println("Hashcode for objects  type of: [" + className + "] - with matching parameters:");
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
    }
*/

}
