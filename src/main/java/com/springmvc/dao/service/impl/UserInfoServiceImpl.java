package com.springmvc.dao.service.impl;

import com.springmvc.dao.entity.UserInfo;
import com.springmvc.dao.mapper.UserInfoMapper;
import com.springmvc.dao.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dream
 * @since 2021-03-04
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
