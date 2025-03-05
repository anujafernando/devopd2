package com.anu.crms.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anu.crms.project.domain.Login;

@Repository
public interface LoginRepo extends JpaRepository<Login , String> {
    login findByUsernameandPassword(String username, String password);

}
