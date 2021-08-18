package com.bridgelabz;

public class CustomException extends Exception {

    public enum Exception {
        FIRST_NAME_INCORRECT,LAST_NAME_INCORRECT,EMAIL_INCORRECT,PHONE_INCORRECT,
        CITY_INCORRECT,STATE_INCORRECT
    }

    public Exception type;

    public CustomException(Exception type) {
        this.type = type;
    }
}
