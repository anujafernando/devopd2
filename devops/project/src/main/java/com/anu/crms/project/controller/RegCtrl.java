package com.anu.crms.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anu.crms.project.service.RegisterService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class RegCtrl {
    @Autowired
    private RegisterService register;
    @GetMapping("/register")
    public String showregregisterpage() {
        return "register";
    }
    @PostMapping("/register")
    public String postMethodName(@RequestParam String username,@RequestParam String password,Model mod) {
        //TODO: process POST request
        
        boolean isregistered = regser.register(username,password);
        if(isregistered)
        {
            mod.addAttribute("message","Registration Successful");
            return "register";
        }    
    }
    
}
