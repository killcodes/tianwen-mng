package com.springmvc.controller;

import com.springmvc.dao.entity.UserInfo;
import com.springmvc.dao.service.impl.UserInfoServiceImpl;
import com.springmvc.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class LoginController {

    @Resource
    private UserServiceImpl userService;

    @RequestMapping(name = "/login", method = RequestMethod.POST)
    public String login(String userName, String password, Model model){
        UserInfo userInfo = userService.searchUserInfo(userName, password);
        if (null == userInfo){
            model.addAttribute("errorMessage","用户名或者密码错误");
            return "index";
        }
        model.addAttribute("userName", userInfo.getUserName());
        return "test";
    }

}
