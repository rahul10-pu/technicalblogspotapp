package com.upgrad.technicalblogspot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class UserController {
    public String login(Model model){
        model.addAttribute("user",new User());

    }
}
