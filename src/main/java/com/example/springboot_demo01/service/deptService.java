package com.example.springboot_demo01.service;


import com.example.springboot_demo01.mapper.deptMapper;
import com.example.springboot_demo01.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class deptService {

    @Autowired
    deptMapper deptMapper;

    public Dept getUserById(Integer id){
        Dept deptById = deptMapper.getDeptById(id);
        return deptById;
    }
}
