package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String sendGreetings() {
        return "Hello, World!";
    }
    @GetMapping("/hi")
    public String sendHi(){
        return "Hi";
    }
    @GetMapping("/bugFix")
    public String getInfoOnBugs(){
        return "bug got fixed";
    }

    @GetMapping("/bugFix1")
    public String getInfoOnBugs1(){
        return "bug got fixed";
    }
    @GetMapping("/bugFix3")
    public String getInfoOnBugs3(){
        return "bug got fixed3";
    }
    @GetMapping("/bugFix4")
    public String getInfoOnBugs4(){
        return "bug got fixed3";
    }

}
