package org.example;

public class Main {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("Mayo Clinic in Rochester");
        Department department = new Department("Infectious");
        Labolatory labolatory = new Labolatory(1200);

        Person person = new Person(1, "Denny", "Targ", 25);
        Patient patient = new Patient(2,"Rick", "Sanchez", 70);
        patient.setCondition("Headache");

        MedicalStaff medicalStaff = new MedicalStaff(3, "Sarah", "Cameron", 52);
        Support support = new Support("cleaning","Cleaner");
        Nurse nurse = new Nurse(4, "Joe", "Goldberg", 32, 73);
        Doctor doctor = new Doctor(5, "Bruce", "Wayne", 46, 40);

        SocialRoom socialRoom = new SocialRoom(true);
        Bathroom bathroom = new Bathroom(true);
        PatientRoom patientRoom = new PatientRoom(4);

        Ambulance ambulance = new Ambulance("Volvo", 1992);
        Parking parking= new Parking(13,true);

        Equipment equipment = new Equipment(2);

        System.out.println(hospital);
        System.out.println(department);
        System.out.println(labolatory);
        System.out.println(person);
        System.out.println(patient);
        System.out.println(medicalStaff);
        System.out.println(support);
        System.out.println(nurse);
        System.out.println(doctor);
        System.out.println(socialRoom);
        System.out.println(bathroom);
        System.out.println(patientRoom);
        System.out.println(ambulance);
        System.out.println(parking);
        System.out.println(equipment);
        
    }
}