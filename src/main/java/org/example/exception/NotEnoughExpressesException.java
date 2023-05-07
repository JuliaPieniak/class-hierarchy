package org.example.exception;

public class NotEnoughExpressesException extends IllegalStateException{
    public NotEnoughExpressesException() {
        super("There should be more coffee express!");
    }
}
