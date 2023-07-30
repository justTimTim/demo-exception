package com.example.demo.exception.handler;

import java.time.LocalDateTime;
import java.util.Objects;

public class ExampleApiError {

  private String message;
  private Integer code;
  private LocalDateTime dateTime;


  public ExampleApiError(String message, Integer code, LocalDateTime dateTime) {
    this.message = message;
    this.code = code;
    this.dateTime = dateTime;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public LocalDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(LocalDateTime dateTime) {
    this.dateTime = dateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExampleApiError that = (ExampleApiError) o;
    return Objects.equals(message, that.message) && Objects.equals(code,
        that.code) && Objects.equals(dateTime, that.dateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, code, dateTime);
  }
}
