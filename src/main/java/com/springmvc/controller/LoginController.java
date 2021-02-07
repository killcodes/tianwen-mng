package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(name = "/login", method = RequestMethod.POST)
    public String login(String userName, String password, Model model){
        model.addAttribute("userName",userName);
        model.addAttribute("password",password);
        return "test";
    }

}
