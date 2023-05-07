package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.demo.Demo;
import org.example.demo.DemoUtil;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(DemoUtil.class);

    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("C:\\Programowanie\\example.txt")) {
            String textToWrite = "Hello, Everyone!";
            writer.write(textToWrite);
            LOGGER.info("Text written to file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        Demo.start();

    }

    static {
        LOGGER.info("Static Block");
    }


}