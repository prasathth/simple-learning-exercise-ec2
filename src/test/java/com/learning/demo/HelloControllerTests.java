package com.learning.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class HelloControllerTests {

    @InjectMocks
    private HelloController controller;

    @Test
    void helloWorldSuccess(){
        String result = controller.helloWorld();

        Assertions.assertEquals("Hello world! From an EC2 instance", result);
    }
}
