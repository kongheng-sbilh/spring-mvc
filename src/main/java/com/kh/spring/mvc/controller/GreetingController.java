package com.kh.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/")
    public String dashboard() {
        return "dashboard";
    }

    @PostMapping("/home")
    public String home(@RequestParam("userName") String userName, Model model) {
        model.addAttribute("userName", userName);
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
