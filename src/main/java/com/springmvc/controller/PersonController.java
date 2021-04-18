package com.springmvc.controller;

import com.springmvc.dao.entity.Person;
import com.springmvc.dao.service.IPersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/person")
public class PersonController {

    @Resource
    private IPersonService personService;

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public List<Person> queryPersons(String name, String workId){
        List<Person> personList = personService.searchPerson(workId, name);
        return personList;
    }

//    @RequestMapping(value = "/list", method = RequestMethod.POST)
//    @ResponseBody
//    public String queryPersons(String name, String workId, Model model){
//        List<Person> personList = personService.searchPerson(workId, name);
//        model.addAttribute("personList", personList);
//        return "mng";
//    }

}
