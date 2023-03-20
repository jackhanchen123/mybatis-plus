package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

// 自定义实现类继承plus自带的实现类，并且同时实现plus的接口。做到基础功能引用，同时可以自定义。
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    // 自定义业务

}
