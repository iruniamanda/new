package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class WelocomeController {

    @GetMapping("/welcome")
    public String sayWelcome(){
        return "Welcome to Loit";
    }
}
