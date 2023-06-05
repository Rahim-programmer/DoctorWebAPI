package com.example.DoctorWebAPI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Articles")
public class ArticlesController {
    @GetMapping
    public String articles(){
        return "Articles";
    }
}