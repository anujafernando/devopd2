package com.anu.crms.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anu.crms.project.repository.registerrepo;

@Service
public class RegisterService {
    @Autowired
    private registerrepo repo;
    public boolean register(String username,String password){
        if(repo.findByUsername(username)!=null){
            return false;
        }
        Login newuser = new Login(username.password);
        repo.save(newuser);
        return true;



    }
}
