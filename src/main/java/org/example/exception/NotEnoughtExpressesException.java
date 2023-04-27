package org.example.exception;

public class NotEnoughtExpressesException extends Exception{
    public NotEnoughtExpressesException() {
        super("There should be more coffee express!");
    }
}
