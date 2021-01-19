package com.pcass.SpringSecPractise.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String root(){
        return "<h1> No Security </h1>";
    }

    @GetMapping("/user")
    public String user(){
        return "<h1> user only</h1>";
    }

    @GetMapping("/admin")
    public String admin(){
        return "<h1> admin only </h1>";
    }

}
