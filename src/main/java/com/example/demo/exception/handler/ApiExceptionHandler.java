package com.example.demo.exception.handler;

import com.example.demo.exception.ApiException;
import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler {

  @ExceptionHandler(value = {RuntimeException.class})
  public ResponseEntity<Object> handler(RuntimeException e) {
    HttpStatus badRequest = HttpStatus.INTERNAL_SERVER_ERROR;
    return new ResponseEntity<>(e.getMessage(), badRequest);
  }

  @ExceptionHandler(value = {ApiException.class})
  public ResponseEntity<Object> handler(ApiException e) {

    HttpStatus badRequest = HttpStatus.BAD_REQUEST;
    ExampleApiError error =
        new ExampleApiError(e.getMessage(), e.getCode(), LocalDateTime.now());

    return new ResponseEntity<>(error, badRequest);
  }

}
