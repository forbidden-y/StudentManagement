package org.example.exceptions;

public class InvalidStudentDataException extends RuntimeException{
    public InvalidStudentDataException() {
        super();
    }

    public InvalidStudentDataException(String message) {
        super(message);
    }

    public InvalidStudentDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidStudentDataException(Throwable cause) {
        super(cause);
    }

    public InvalidStudentDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
