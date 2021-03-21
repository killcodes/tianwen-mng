package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/person")
public class PersonController {

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String queryPersons(String name, String workId, Model model){
        List<Map<String, String>> result = new ArrayList<>(2);
        Map<String, String> one = new HashMap<>(8);
        one.put("name", "张三");
        one.put("workId", "1043453");
        one.put("birthDay", "1991-01-01");
        one.put("status", "在职");
        one.put("createTime", "2021-01-01 21:00:00");
        result.add(one);
        model.addAttribute("personList",result);

        return "mng";
    }

}
