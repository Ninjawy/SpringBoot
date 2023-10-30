package com.training.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that return "Hello world"
    @GetMapping("/")
    public String sayHello() {
        return "Hello world!";
    }
    
    @Value("${coach.name}")
    private String coachName;
    
    @Value("${team.name}")
    private String teamName;

}
