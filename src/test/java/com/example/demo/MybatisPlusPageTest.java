package com.example.demo;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MybatisPlusPageTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testPage(){
        // 当前页页码，每页显示的条数
        Page<User> page =new Page<>(1,3);
        QueryWrapper<User> queryWrapper =new QueryWrapper<>();
        queryWrapper.le("age",10);
        Page<User> selectPage = userMapper.selectPage(page, queryWrapper);

        System.out.println(selectPage.getRecords());            // 当前页数据
        System.out.println("总页数:"+selectPage.getPages());     // 总页数
        System.out.println("总条数:"+selectPage.getTotal());     // 总条数
        System.out.println(selectPage.hasNext());               // 是否有下一页
        System.out.println(selectPage.hasPrevious());           // 是否有上一页
    }
}
