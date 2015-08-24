package com.elegion.androidschool;

/**
 * Signals that program was launched without enough arguments.
 *
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
