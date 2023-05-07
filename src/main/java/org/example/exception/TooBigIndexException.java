package org.example.exception;

public class TooBigIndexException extends IndexOutOfBoundsException{
    public TooBigIndexException() {
        super("Index is too big");
    }
}
