package org.example.exception;

public class TooBigIndexException extends Exception{
    public TooBigIndexException() {
        super("Index is too big");
    }
}
