package com.springmvc.controller;

import com.springmvc.dao.entity.UserInfo;
import com.springmvc.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @Resource
    private UserServiceImpl userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String userName, String password, Model model, HttpServletRequest request){
        String encodePassword = DigestUtils.md5DigestAsHex(password.getBytes());
        UserInfo userInfo = userService.searchUserInfo(userName, encodePassword);
        if (null == userInfo){
            model.addAttribute("errorMessage","用户名或者密码错误");
            return "index";
        }
        userInfo.setPassword(null);
        model.addAttribute("userName", userInfo.getUserName());

        request.getSession().setAttribute("user", userInfo);
        return "mng";
    }

}
