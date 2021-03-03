package com.springmvc.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.springmvc.dao.entity.UserInfo;
import com.springmvc.dao.service.IUserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl {

    @Resource
    private IUserInfoService userInfoService;

    public UserInfo searchUserInfo(String userName, String password){
        QueryWrapper<UserInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("user_name", userName);
        wrapper.eq("password", password);
        List<UserInfo> userInfos = userInfoService.list(wrapper);
        if (null != userInfos && userInfos.size() > 0){
            return userInfos.get(0);
        }
        return null;
    }

    public void test(){
        System.out.println("userService");
    }

}
