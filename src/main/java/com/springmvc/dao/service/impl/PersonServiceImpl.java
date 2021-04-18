package com.springmvc.dao.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.springmvc.dao.entity.Person;
import com.springmvc.dao.mapper.PersonMapper;
import com.springmvc.dao.service.IPersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dream
 * @since 2021-04-18
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

    @Override
    public List<Person> searchPerson(String workId, String name){
        QueryWrapper<Person> wrapper = new QueryWrapper<>();
        if (StringUtils.isNotBlank(workId)){
            wrapper.eq("work_id", workId);
        }
        if (StringUtils.isNotBlank(name)){
            wrapper.like("name", "%" + name + "%");
        }

        return this.baseMapper.selectList(wrapper);
    }

}
