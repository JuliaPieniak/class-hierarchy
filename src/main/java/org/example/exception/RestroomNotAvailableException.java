package org.example.exception;

public class RestroomNotAvailableException extends IllegalStateException {

    public RestroomNotAvailableException() {
        super("Restroom not available");
    }
}
