package com.springmvc.controller;

import com.springmvc.common.Result;
import com.springmvc.dao.entity.Person;
import com.springmvc.dao.service.IPersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;
import sun.security.provider.MD5;
import sun.security.rsa.RSASignature;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/person")
@Slf4j
public class PersonController {

    @Resource
    private IPersonService personService;

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public List<Person> queryPersons(String name, String workId){
        List<Person> personList = personService.searchPerson(workId, name);
        return personList;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Result<String> save(@RequestBody Person person){
        try {
            person.setCreateTime(new Date());
            personService.save(person);
            return new Result<>(true, null);
        }catch (Exception e){
            log.error("添加人员出错:{}", e.getMessage(), e);
            return new Result<>(false, e.getMessage());
        }
    }

    public static void main(String[] args){
        System.out.println(DigestUtils.md5DigestAsHex("aa".getBytes()));
    }

}
