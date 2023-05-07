package org.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.exception.NotEnoughExpressesException;
import org.example.model.Hospital;

import java.util.Scanner;

public class Demo {

    private static Hospital hospitalState;
    private static final Logger LOGGER = LogManager.getLogger(DemoUtil.class);



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
                LOGGER.info("The End");
                break;
            }

            int index;
            try {
                index = Integer.parseInt(line);
            } catch (Exception e) {
                LOGGER.info("Index is not valid:");
                LOGGER.info("-> " + e.getClass());
                continue;
            }

            switch (index) {
                case (1) -> showHospital();
                case (2) -> showDepartments();
                case (3) -> showStaff();
                case (4) -> addPatient();
                case (5) -> addDoctor();
           //     case (6) -> checkExpressCounter();
                default -> LOGGER.info("Index does not exist");
            }
        }


    }

    public static void showMenuOptions() {
        LOGGER.info("__________________________________");
        LOGGER.info("X) End demo");
        LOGGER.info("1) Show hospital");
        LOGGER.info("2) Show departments");
        LOGGER.info("3) Show staff");
        LOGGER.info("4) Add patient to department");
        LOGGER.info("5) Add Doctor to department");
        LOGGER.info("__________________________________");

    }


    public static void showHospital() {
        LOGGER.info(hospitalState);
    }

    public static void showDepartments() {
        LOGGER.info(hospitalState.getDepartments());
    }

   public static void addPatient() {
        DemoUtil.addPatient();
   }

   public static void addDoctor() {
        DemoUtil.addDoctor();
   }

    public static void showStaff() {
        LOGGER.info(hospitalState.getStaffMembers());
    }

    public static void checkExpressCounter() throws NotEnoughExpressesException {
        DemoUtil.countExpress();
    }

}
