package com.example.helloworld;

import com.example.helloworld.controller.AdditionMethod;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args) {

        SpringApplication.run(HelloWorldApplication.class, args);
        AdditionMethod am=new AdditionMethod();
        am.GetResult();
    }

}
