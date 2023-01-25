package com.example.springboot_demo01.mapper;


import com.example.springboot_demo01.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

//@Mapper
public interface deptMapper {
    /**
     * 根据id查询数据
     * @param id
     * @return
     */
    public Dept getDeptById(Integer id);
}
