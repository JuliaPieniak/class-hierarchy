package org.example.demo;

import org.example.exception.NotEnoughtExpressesException;
import org.example.model.Hospital;

import java.util.Scanner;

public class Demo {

    private static Hospital hospitalState;


    public static void start() {
        DemoUtil.initHospitalState();
        hospitalState = DemoUtil.getHospitalState();
        showMenu();
    }

    private static void showMenu() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            showMenuOptions();
            String line = scanner.nextLine();

            if (line.equalsIgnoreCase("x")) {
                System.out.println("The End");
                break;
            }

            int index;
            try {
                index = Integer.parseInt(line);
            } catch (Exception e) {
                System.out.println("Index is not valid:");
                System.out.println("-> " + e.getClass());
                continue;
            }

            switch (index) {
                case (1) -> showHospital();
                case (2) -> showDepartments();
                case (3) -> showStaff();
                case (4) -> addPatient();
                case (5) -> addDoctor();
           //     case (6) -> checkExpressCounter();
                default -> System.out.println("Index does not exist");
            }
        }


    }

    public static void showMenuOptions() {
        System.out.println("__________________________________");
        System.out.println("X) End demo");
        System.out.println("1) Show hospital");
        System.out.println("2) Show departments");
        System.out.println("3) Show staff");
        System.out.println("4) Add patient to department");
        System.out.println("5) Add Doctor to department");
        System.out.println("__________________________________");

    }


    public static void showHospital() {
        System.out.println(hospitalState);
    }

    public static void showDepartments() {
        System.out.println(hospitalState.getDepartments());
    }

   public static void addPatient() {
        DemoUtil.addPatient();
   }

   public static void addDoctor() {
        DemoUtil.addDoctor();
   }

    public static void showStaff() {
        System.out.println(hospitalState.getStaffMembers());
    }

    public static void checkExpressCounter() throws NotEnoughtExpressesException {
        DemoUtil.countExpress();
    }

}
