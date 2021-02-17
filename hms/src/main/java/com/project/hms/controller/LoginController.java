package com.project.hms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

   /* @GetMapping("/")
    public String defaultHome(){
        System.out.println("hellsdfdso");
        return "customer/login";
    }*/
    @GetMapping("/login")
    public String getLoginPage(){
        System.out.println("hello");
        return "customer/login";
    }

    @GetMapping("/home")
    public String getCustomerHome(){
        return "customer/home";
    }

    @GetMapping("/employee")
    public String employee(){
        return "employee/login";
    }
    @GetMapping("/employee/login")
    public String getEmployeeLogin(){
        return "employee/login";
    }

    @GetMapping("/employee/home")
    public String getEmployeeHome(){
        return "employee/home";
    }


}
