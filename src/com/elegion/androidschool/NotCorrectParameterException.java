package com.elegion.androidschool;

/**
 * Created by Aleksandra on 20.08.15.
 */
public class NotCorrectParameterException extends Exception {
    public NotCorrectParameterException() {
    }

    public NotCorrectParameterException(String message) {
        super(message);
    }
}
