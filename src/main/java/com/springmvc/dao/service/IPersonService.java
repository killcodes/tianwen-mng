package com.springmvc.dao.service;

import com.springmvc.dao.entity.Person;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dream
 * @since 2021-04-18
 */
public interface IPersonService extends IService<Person> {

    List<Person> searchPerson(String workId, String name);

}
