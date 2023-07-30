package com.example.demo.exception;

public class ApiException extends RuntimeException {

  private final int code;

  public ApiException(ExceptionBase e) {
    super(e.getMsg());
    this.code = e.getCode();
  }

  public ApiException(String message) {
    super(message);
    this.code = 0;
  }

  public int getCode() {
    return code;
  }

}
