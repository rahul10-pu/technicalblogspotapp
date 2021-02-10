package com.upgrad.technicalblogspot.controller;


import com.upgrad.technicalblogspot.model.user;
import com.upgrad.technicalblogspot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    private UserService userService=new UserService();
    @RequestMapping("users/login")
    public String login(Model model){
        model.addAttribute("user", new user());
        return "users/login";
    }
    @RequestMapping(value="users/login",method= RequestMethod.POST)
    public String loginUser(user user){
        System.out.println("helloooooooo");
        if(userService.login(user)){
            return "redirect:/posts";
        }else{
            return  "users/login";
        }
    }
    @RequestMapping("users/registration")
    public String registration(){
        return "users/registration";
    }
    @RequestMapping(value="users/registration",method=RequestMethod.POST)
    public String registrationUser(user user){
        return "redirect:/users/login";
    }
}
