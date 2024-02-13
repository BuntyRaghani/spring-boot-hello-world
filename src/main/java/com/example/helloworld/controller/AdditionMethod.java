package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionMethod {

    @GetMapping("/getSum")
    public int GetResult(){
        return 9;
    }
}
