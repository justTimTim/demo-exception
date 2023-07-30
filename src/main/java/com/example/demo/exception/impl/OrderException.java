package com.example.demo.exception.impl;

import com.example.demo.exception.ExceptionBase;

/**
 * This class is intended for declaring exceptions that occur during order processing. code range
 * 101-199.
 */
public enum OrderException implements ExceptionBase {
  ORDER_NOT_FOUND("Order not found.", 101),
  ORDER_CANNOT_BE_UPDATED("Order cannot be updated,", 102);

  OrderException(String msg, Integer code) {
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
