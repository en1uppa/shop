package com.enjuppa;

import com.enjuppa.mapper.UserMapper;
import com.enjuppa.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisQuickstartApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
 public  void testListUser() {
        List<User> userList = userMapper.list();
        userList.stream().forEach(user ->
        {
            System.out.println(user);
        });
    }

}
