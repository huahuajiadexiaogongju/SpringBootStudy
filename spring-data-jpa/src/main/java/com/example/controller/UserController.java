package com.example.controller;

import com.example.entity.Student;
import com.example.entity.SysUser;
import com.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 史冬阳 on 2018/9/27.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/all")
    public List<SysUser> getAll(){
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public SysUser get(@PathVariable Long id){
        return userService.get(id);
    }

    @GetMapping("/{account}")
    public SysUser get(String account){
        return userService.findByAccount(account);
    }

    @GetMapping("/{nickname}")
    public  List<SysUser> getnickname(String nickname){
        return userService.findByNicknameLike(nickname);
    }

    @GetMapping("/order")
    public List<SysUser> getUsersOrderByFans(@RequestParam String nickname) {
        return userService.getUsersOrderByFans(nickname);
    }

    @GetMapping("{fans}")
    public List<SysUser> getUsers(Integer num1,Integer num2){
        return userService.findByFansBetween(num1,num2);
    }



}
