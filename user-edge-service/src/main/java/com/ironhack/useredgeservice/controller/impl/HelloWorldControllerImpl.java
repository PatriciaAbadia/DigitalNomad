package com.ironhack.useredgeservice.controller.impl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class HelloWorldControllerImpl {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello world";
    }

}
