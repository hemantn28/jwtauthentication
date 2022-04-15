package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //ENDPOINT

    @RequestMapping("/smsmme")
    public void sms(){
        System.out.println("How are you?");
    }

@RequestMapping("/message")
    public String hello(){
return "Hi, How are you?";
    }

    @RequestMapping("/printInfo")
    public int number(){
        return 9;
    }

    @RequestMapping("/printDecimal")
    public double pointNumber(){
        return 9.18;
    }

    @RequestMapping("/printSentence")
    public String word(){
        return "Spring Boot has been started..";
    }
}
