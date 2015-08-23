package com.elegion.androidschool;

/**
 * @author Bobrova Aleksandra
 */
public class NotEnoughArgumentsException extends Exception {
    public NotEnoughArgumentsException() {
        super();
    }

    public NotEnoughArgumentsException(String message) {
        super(message);
    }
}
