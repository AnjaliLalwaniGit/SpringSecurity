package com.springsecurity.SpringSecurityApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

    @GetMapping("/user")
    public String getUser(){
        return "<h1>Hello User!!</h1>";
    }

}
