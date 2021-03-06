package com.example;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by simonhamermesh on 3/28/16.
 */
@Entity
@Table(name = "UsersAuthenticationAndAuthorization")
public class User {


    @Id
    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String role;


    public User() {
    }
    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
