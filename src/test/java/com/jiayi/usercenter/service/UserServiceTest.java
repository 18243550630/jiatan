package com.jiayi.usercenter.service;

import com.jiayi.usercenter.model.domain.User;
import jakarta.annotation.Resource;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testAddUser(){
        User user=new User();
        user.setUsername("jiatan");
        user.setUserAccount("123");
        user.setAvatarUrl("https://image.gcores.com/d727c016-f721-4848-aeb1-e85cc52c27a7.jpg?x-oss-process=image/quality,q_90/format,webp/watermark,image_d2F0ZXJtYXJrLnBuZw,g_se,x_10,y_10");
        user.setGender(0);
        user.setUserPassword("123456");
        user.setPhone("123");
        user.setEmail("456");

        boolean result =userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }

/*    @Test
    void userRegister() {
        String userAccent = "jiatan";
        String userPassword= "1234567";
        String checkPassword = "1235467";
        long result= userService.userRegister(userAccent,userPassword,checkPassword);
        Assertions.assertEquals(-1,result);
        userAccent ="jiatan";
        result=userService.userRegister(userAccent,userPassword,checkPassword);
        Assertions.assertTrue(result>0);
    }*/
}