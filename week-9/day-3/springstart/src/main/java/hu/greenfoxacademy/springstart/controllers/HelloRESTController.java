package hu.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class HelloRESTController {
    

    @RequestMapping(value="/greeting", method = RequestMethod.GET)
    public Greeting greetingYou(
            @RequestParam(value = "name", required = false) String value) {
        Greeting greetingYou=new Greeting(1, "Hello "+ value + "!");
        return greetingYou;

    }


}

