package com.example.continuoudeploymentandintegration.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index (){
        System.out.println("Test linje 11");
        return "index.html";
    }
}
