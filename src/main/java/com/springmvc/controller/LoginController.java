package com.springmvc.controller;

import com.springmvc.dao.entity.UserInfo;
import com.springmvc.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {

    @Resource
    private UserServiceImpl userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String userName, String password, Model model){
        String encodePassword = DigestUtils.md5DigestAsHex(password.getBytes());

        UserInfo userInfo = userService.searchUserInfo(userName, encodePassword);
        if (null == userInfo){
            model.addAttribute("errorMessage","用户名或者密码错误");
            return "index";
        }
        model.addAttribute("userName", userInfo.getUserName());
        List<Map<String, String>> result = new ArrayList<>(2);
        model.addAttribute("personList",result);

        return "mng";
    }

}
