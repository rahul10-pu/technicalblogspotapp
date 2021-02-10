package com.upgrad.technicalblogspot.controller;

import com.upgrad.technicalblogspot.model.Post;
import com.upgrad.technicalblogspot.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class PostController {
    PostService postService=new PostService();
    @RequestMapping("/posts")
    public String getUserPost(Model model){
        ArrayList<Post> posts=postService.getAllPosts();
        model.addAttribute("posts",posts);
        return "posts";
    }
}
