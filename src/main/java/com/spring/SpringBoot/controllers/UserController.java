package com.spring.SpringBoot.controllers;

import com.spring.SpringBoot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {
    final String title="Test page";

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user")
    public String user(Model model, @RequestParam(value="name", required = false, defaultValue = "user") String name) {
        model.addAttribute("name", name);
        model.addAttribute("title", title);
        return "user";
    }
}
