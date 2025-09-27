package org.example.exceptions;

/**
 * @author bay
 */
public class StudentAlreadyExistsException extends RuntimeException{
    private String studentId;

    public StudentAlreadyExistsException() {
        super();
    }

    public StudentAlreadyExistsException(String message) {
        super(message);
    }

    public StudentAlreadyExistsException(String message, String studentId) {
        super(message);
        this.studentId = studentId;
    }

    public StudentAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentAlreadyExistsException(Throwable cause) {
        super(cause);
    }

    public StudentAlreadyExistsException(String message, String studentId, Throwable cause) {
        super(message, cause);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }
}
