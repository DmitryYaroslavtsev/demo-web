package com.github.dmitryyaroslavtsev.demoweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String getMain() {
        return "MainPage.html";
    }

    @GetMapping("/secondPage")
    public String getSecond() {
        return "SecondPage.html";
    }
}
