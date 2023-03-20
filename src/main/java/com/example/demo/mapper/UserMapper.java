package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.User;


import java.util.List;

public interface UserMapper extends BaseMapper<User>{

    public List<User> listUser();
}
