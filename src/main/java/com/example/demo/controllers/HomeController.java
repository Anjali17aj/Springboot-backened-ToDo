package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {
    @RequestMapping("/todos")
    public List<String> justTest(){
        List<String> todos = Arrays.asList("Java","SpringBoot","Developed a springboot project");
        return todos;
    }
}
