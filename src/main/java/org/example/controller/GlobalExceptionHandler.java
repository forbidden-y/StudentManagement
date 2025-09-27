package org.example.controller;

import org.example.exceptions.InvalidStudentDataException;
import org.example.exceptions.StudentAlreadyExistsException;
import org.example.exceptions.StudentNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author bay
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(StudentNotFoundException.class)
    public Result<String> handleStudentNotFoundException(StudentNotFoundException e) {
        return Result.error(404, e.getMessage());
    }

    @ExceptionHandler(StudentAlreadyExistsException.class)
    public Result<String> handleStudentAlreadyExistsException(StudentAlreadyExistsException e) {
        return Result.error(409, e.getMessage());
    }

    @ExceptionHandler(InvalidStudentDataException.class)
    public Result<String> handleInvalidStudentDataException(InvalidStudentDataException e) {
        return Result.error(400, e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result<String> handleGenericException(Exception e) {
        return Result.error(500, "系统内部错误: " + e.getMessage());
    }
}
