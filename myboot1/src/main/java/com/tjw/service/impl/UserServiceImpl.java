package com.tjw.service.impl;

import com.tjw.domain.User;
import com.tjw.mapper.EmpMapper;
import com.tjw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author jingwen.tang
 * Created ON 2017/9/21 上午 11:46.
 * @Position Beijing
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private EmpMapper empMapper;
    @Override
    public User getUserById(String id) {
        return empMapper.getUser(id);
    }
}
