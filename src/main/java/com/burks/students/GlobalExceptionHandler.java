package com.burks.students;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleResourceNotFoundException(ResourceNotFoundException ex) {
        ErrorResponse errorResponse = new ErrorResponse( LocalDateTime.now(),
                HttpStatus.NOT_FOUND.value(),  HttpStatus.NOT_FOUND.getReasonPhrase(), ex.getMessage());
                return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGeneralException(Exception e) {
        ErrorResponse error = new ErrorResponse(LocalDateTime.now(),
                                                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                                                HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(),
                                                "An unexpected error occurred.");
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
                                               
    }


    
}
