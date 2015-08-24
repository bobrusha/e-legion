package com.elegion.androidschool;

/**
 * Signals that format of input file is incorrect.
 *
 * @author Bobrova Aleksandra
 */
public class NotCorrectInputFormatException extends Exception {
    public NotCorrectInputFormatException() {
    }

    public NotCorrectInputFormatException(String message) {
        super(message);
    }
}
