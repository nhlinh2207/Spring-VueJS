package com.example.springvuejs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class HomeController {

    @GetMapping(path = "/hello")
    public String hello(){
        return "Hello VueJS";
    }

    @GetMapping(path = "/goodbye")
    public String goodbye(){
        return "goodbye";
    }
}
