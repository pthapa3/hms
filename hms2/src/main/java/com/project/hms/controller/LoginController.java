package com.project.hms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class LoginController {

    @RequestMapping("/")
    public ModelAndView defaultHome() {
        return new ModelAndView("login");
    }

    @RequestMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    @RequestMapping("/dashboard")
    public ModelAndView userDashboard() {
        return new ModelAndView("dashboard");
    }

    @RequestMapping("/admin/")
    public ModelAndView admin() {
        return new ModelAndView("admin/login");
    }

    @RequestMapping("/admin/login")
    public ModelAndView adminlogin() {
        return new ModelAndView("admin/login");
    }

    @RequestMapping("/admin/dashboard")
    public ModelAndView admindashboard() {
        return new ModelAndView("admin/dashboard");
    }
}