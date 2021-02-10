package com.upgrad.technicalblogspot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping
    public String login(Model model){
        model.addAttribute("user",new User());

    }
}
