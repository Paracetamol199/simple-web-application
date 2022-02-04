package com.example.simplewebapplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @RequestMapping(value="/")
    public String index() {
        return "Hello World!";
    }
}
