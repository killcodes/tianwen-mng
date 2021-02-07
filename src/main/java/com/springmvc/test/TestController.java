package com.springmvc.test;

import com.springmvc.service.ServiceTestImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class TestController {

    @Resource
    private ServiceTestImpl serviceTest;

    @RequestMapping("/")
    public String index(){
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("/WEB-INF/index.jsp");
        serviceTest.test();
        return "index";
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

}
