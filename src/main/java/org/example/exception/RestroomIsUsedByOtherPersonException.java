package org.example.exception;

public class RestroomIsUsedByOtherPersonException extends UnauthorizedAccessException {

    public RestroomIsUsedByOtherPersonException() {
        super("Restroom is used by other person exception");
    }
}
