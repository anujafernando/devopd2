package com.anu.crms.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anu.crms.project.service.RegisterService;

import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class RegCtrl {
    @Autowired
    private RegisterService regser;
    @GetMapping("/register")
    public String showregregisterpage() {
        return "register";
    }
    @PostMapping("/register")
    public String postMethodName(@RequestParam String username,@RequestParam String password,Model mod) {
        
        boolean isregistered = regser.register(username,password);
        if(isregistered)
        {
            mod.addAttribute("message","Registration Successful");
            return "register";
        }   
        else
        {
            mod.addAttribute("error","Username already exists");
            return "register";
        }
    }
    
}
