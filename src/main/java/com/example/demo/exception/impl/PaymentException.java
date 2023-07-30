package com.example.demo.exception.impl;

import com.example.demo.exception.ExceptionBase;

public enum PaymentException implements ExceptionBase {
  PAYMENT_NOT_FOUND("Payment not found.", 201),
  PAYMENT_LINK_NOT_VALID("Payment link is not valid.", 202);

  PaymentException(String msg, Integer code) {
    this.msg = msg;
    this.code = code;
  }

  private final String msg;
  private final Integer code;

  @Override
  public String getMsg() {
    return msg;
  }

  @Override
  public Integer getCode() {
    return code;
  }
}
