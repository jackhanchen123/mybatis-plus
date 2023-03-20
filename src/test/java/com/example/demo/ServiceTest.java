package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class ServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetCount(){
        long count = userService.count();
        System.out.println("总记录数："+count);
    }

    @Test
    public void testInsertBatch(){
        List<User> list =new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            User user =new User();
            user.setAge(i);
            user.setName("aaa");
            list.add(user);
        }
        // plus的basemapper没有批量插入，这里使用plus的service层的批量插入方法
        boolean b = userService.saveBatch(list);
        System.out.println("是否批量插入成功"+b);
    }
}
