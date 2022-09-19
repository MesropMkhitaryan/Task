package com.example.taskmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @GetMapping(value = "/")
    public String mainPage(){
        System.out.println("Hello from controller");
        return "index";
    }
    @GetMapping(value = "/home")
    public String homePage(){
        System.out.println("Hello from controller");
        return "home";
    }


}
