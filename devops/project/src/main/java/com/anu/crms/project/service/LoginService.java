package com.anu.crms.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anu.crms.project.domain.Login;
import com.anu.crms.project.repository.LoginRepo;

@Service
public class LoginService {
@Autowired
private LoginRepo repo;
public Login log(String username, String password){
    Login user1 = repo.findByUsernameandPassword(username,password);
    return user1;
    
}

}
