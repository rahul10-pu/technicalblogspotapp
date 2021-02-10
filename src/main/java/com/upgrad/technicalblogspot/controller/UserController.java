package com.upgrad.technicalblogspot.controller;


import com.upgrad.technicalblogspot.model.user;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("users/login")
    public String login(Model model){
        model.addAttribute("user", new user());
        return "users/login";
    }
}
