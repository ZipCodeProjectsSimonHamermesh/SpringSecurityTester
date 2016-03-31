package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by simonhamermesh on 3/28/16.
 */

@RestController
public class Controllers {

    @Autowired
    UserRepo userRepo;

    @RequestMapping("/createNewUser")
    public String createNewUser(String username, String password, String role){

        User user = new User(username,password,role);
        userRepo.save(user);



    }


}
