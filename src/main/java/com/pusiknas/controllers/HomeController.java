package com.pusiknas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {

    @GetMapping
    public String welcome(Model model){
        //doing something
        String messages = "Welcome to spring MVC";
        model.addAttribute("msg", messages);
        return "index";
    }
    
}
