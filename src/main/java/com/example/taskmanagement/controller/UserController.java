package com.example.taskmanagement.controller;

import com.example.taskmanagement.entity.User;
import com.example.taskmanagement.repo.UserRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public String users(ModelMap modelMap){
        List<User> all = userRepository.findAll();
        modelMap.addAttribute("users",all);
        return "users";
    }
    @GetMapping("/users/add")
    public String addUsersPage(ModelMap modelMap){
        return "addUsers";
    }
    @PostMapping("/users/add")
    public String addUser(@ModelAttribute User user){
        userRepository.save(user);
        return "redirect:/users";
    }

}
