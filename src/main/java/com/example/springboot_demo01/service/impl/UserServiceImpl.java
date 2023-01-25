package com.example.springboot_demo01.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot_demo01.mapper.UserMapper;
import com.example.springboot_demo01.pojo.User;
import com.example.springboot_demo01.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
