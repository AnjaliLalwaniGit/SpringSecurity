package com.springsecurity.SpringSecurityApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

    @GetMapping("/user")
    public String getUser(){
        return "<h1>Hello User!!</h1>";
    }

    @GetMapping("/admin")
    public String getAdmin(){
        return "<h1>Hello Admin!!</h1>";
    }

    @GetMapping("/home")
    public String getHome(){
        return "<h1>Welcome!!</h1>";
    }

}
