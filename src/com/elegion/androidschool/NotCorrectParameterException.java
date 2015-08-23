package com.elegion.androidschool;

/**
 * @author Bobrova Aleksandra
 */
public class NotCorrectParameterException extends Exception {
    public NotCorrectParameterException() {
    }

    public NotCorrectParameterException(String message) {
        super(message);
    }
}
