package com.anu.crms.project.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="signup")
public class signup {
@Id
private String username;
private String password;
private String confirmpassword;
public String getConfirmpassword() {
    return confirmpassword;
}
public void setConfirmpassword(String confirmpassword) {
    this.confirmpassword = confirmpassword;
}
public signup(String username,String password,String confirmpassword) {
    this.username = username;
    this.password = password;
}
public String getUsername() {
    return username;
}
public void setUsername(String username) {
    this.username = username;
}
public String getPassword() {
    return password;
}
public void setPassword(String password) {
    this.password = password;
}


}
