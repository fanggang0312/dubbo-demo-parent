package com.example.demoprovider.service.impl;

import com.example.demoprovider.mapper.UserMapper;
import com.example.demoservice.model.User;
import com.example.demoservice.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Service
@Component
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public String save(User user) {
        userMapper.insert(user);
        return "success";
    }

    @Override
    public String sayHello(String word) {
        return "hello "+word;
    }
}
