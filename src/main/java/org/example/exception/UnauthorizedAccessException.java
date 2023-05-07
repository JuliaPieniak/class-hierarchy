package org.example.exception;

public class UnauthorizedAccessException extends SecurityException {

    public UnauthorizedAccessException() {
        super("Unauthorized access try caught");
    }

    public UnauthorizedAccessException(String message) {
        super(message);
    }

}
