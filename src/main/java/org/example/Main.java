package org.example;

import org.example.demo.Demo;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("C:\\Programowanie\\example.txt")) {
            String textToWrite = "Hello, Everyone!";
            writer.write(textToWrite);
            System.out.println("Text written to file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        Demo.start();

    }

    static {
        System.out.println("Static Block");
    }


}