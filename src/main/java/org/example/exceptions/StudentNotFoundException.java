package org.example.exceptions;

/**
 * @author bay
 */
public class StudentNotFoundException extends RuntimeException {

    private String studentId;

    public StudentNotFoundException() {
        super();
    }

    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException(String message, String studentId) {
        super(message);
        this.studentId = studentId;
    }

    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentNotFoundException(Throwable cause) {
        super(cause);
    }

    public StudentNotFoundException(String message, String studentId, Throwable cause) {
        super(message, cause);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }
}
