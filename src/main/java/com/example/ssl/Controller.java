package com.example.ssl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hello")
    public String hello() {
        return "Inna Honcharenko [KP-21]";
    }
}
