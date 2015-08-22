package com.aleksandra;

import java.io.IOException;

/**
 * Created by Aleksandra on 20.08.15.
 */
public class NotCorrectParameterException extends IOException {
    public NotCorrectParameterException() {
    }

    public NotCorrectParameterException(String message) {
        super(message);
    }
}
