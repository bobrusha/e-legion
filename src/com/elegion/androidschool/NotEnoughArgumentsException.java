package com.elegion.androidschool;

/**
 * Created by Aleksandra on 20.08.15.
 */
public class NotEnoughArgumentsException extends Exception {
    public NotEnoughArgumentsException() {
        super();
    }

    public NotEnoughArgumentsException(String message) {
        super(message);
    }
}
