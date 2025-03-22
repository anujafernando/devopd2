package com.anu.crms.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anu.crms.project.domain.Login;
import com.anu.crms.project.service.LoginService;

import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class LoginContrl {
@Autowired
private LoginService ser;
@GetMapping("/")
public String getLoginpage() {
    return "login";
}
@PostMapping("/login")
public String postLoginpage(@RequestParam String username,@RequestParam String password, Model mod) {
    Login user2 = ser.log(username,password);
    if(user2!=null)
    {
        return "redirect:/welcome";
    }
    else
    {
        mod.addAttribute("error","Invalid username or password");
        return "login";
    }
    
    
}



}
