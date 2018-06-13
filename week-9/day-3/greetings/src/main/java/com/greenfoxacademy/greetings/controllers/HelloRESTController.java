package com.greenfoxacademy.greetings.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class HelloRESTController {
    Greeting greeting=new Greeting(1, "Hello world");


    @RequestMapping("/greeting")
    public Greeting greet(){
        greeting.getContent();
        greeting.getId();
        return greeting;
    }


}
