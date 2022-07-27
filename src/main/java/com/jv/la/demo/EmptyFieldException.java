package com.jv.la.demo;

public class EmptyFieldException extends Throwable {
    public EmptyFieldException(String s) {
        super(s);
    }

    public EmptyFieldException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
