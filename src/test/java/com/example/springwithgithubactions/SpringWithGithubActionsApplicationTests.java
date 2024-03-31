package com.example.springwithgithubactions;

import com.example.springwithgithubactions.controller.GreetingController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringWithGithubActionsApplicationTests {

  @Autowired
  private GreetingController greetingController;

  @Test
  void testHelloMethod() {
    assertEquals("hello", greetingController.sayHello());
  }


}
