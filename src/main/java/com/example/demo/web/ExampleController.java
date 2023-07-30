package com.example.demo.web;

import com.example.demo.service.ExampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class ExampleController {

  private final ExampleService exampleService;

  public ExampleController(ExampleService exampleService) {
    this.exampleService = exampleService;
  }

  @GetMapping("/order")
  public Object getOrder() {
    return exampleService.getOrder("-1");
  }

  @GetMapping("/payment")
  public Object getPayment() {
    return exampleService.getPayment("-1");
  }

}
