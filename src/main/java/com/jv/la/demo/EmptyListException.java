package com.jv.la.demo;

public class EmptyListException extends Throwable {
    public EmptyListException(String message) {
        super(message);
    }

    public EmptyListException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
