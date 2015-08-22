package com.aleksandra;

import java.io.IOException;

/**
 * Created by Aleksandra on 20.08.15.
 */
public class NotCorrectInputFormatException extends IOException {
    public NotCorrectInputFormatException() {
    }

    public NotCorrectInputFormatException(String message) {
        super(message);
    }
}
