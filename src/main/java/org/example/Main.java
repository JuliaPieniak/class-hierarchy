package org.example;

import org.example.demo.Demo;

public class Main {
    public static void main(String[] args) {
        Demo.start();
    }



    static {
        System.out.println("Static Block");
    }


}