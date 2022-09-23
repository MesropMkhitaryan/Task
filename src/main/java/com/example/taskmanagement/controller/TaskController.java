package com.example.taskmanagement.controller;

import com.example.taskmanagement.entity.Task;
import com.example.taskmanagement.entity.User;
import com.example.taskmanagement.repo.TaskRepository;
import com.example.taskmanagement.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TaskController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    TaskRepository taskRepository;

    @GetMapping("/tasks/add")
    public String TaskPage(ModelMap modelMap){
        List<User> users = userRepository.findAll();
        modelMap.addAttribute("users",users);
        return "addTasks";
    }
    @PostMapping("/tasks/add")
    public String addTask(@ModelAttribute Task task){
        taskRepository.save(task);
        return "redirect:/tasks";
    }
    @GetMapping("/tasks")
    public String TasksPage(ModelMap modelMap){
        List<Task> tasks = taskRepository.findAll();
        modelMap.addAttribute("tasks",tasks);
        return "tasks";
    }
}
