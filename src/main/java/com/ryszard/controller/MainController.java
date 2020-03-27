package com.ryszard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blog")
public class MainController {

    @RequestMapping
    public String mainPAge(Model model){
        model.addAttribute("message","Hello World");
        return "main";
    }
}
