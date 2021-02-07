package com.springmvc.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ServiceTestImpl {

    @Resource
    private UserServiceImpl userService;

    public String test(){
        System.out.println("serviceTest");
        userService.test();
        return "dsds";
    }

    public UserServiceImpl getUserService() {
        return userService;
    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }
}
