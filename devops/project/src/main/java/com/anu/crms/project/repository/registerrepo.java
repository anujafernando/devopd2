package com.anu.crms.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anu.crms.project.domain.Login;

@Repository
public interface registerrepo extends JpaRepository{
    Login findByUsername(String username);
    
}
