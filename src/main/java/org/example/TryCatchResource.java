package org.example;

import java.io.*;

public class TryCatchResource {

    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("C:\\Programowanie\\example.txt")) {
            String textToWrite = "Hello, World!";
            writer.write(textToWrite);
            System.out.println("Text written to file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

}
