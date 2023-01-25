package com.example.springboot_demo01.pojo;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
/** mybatisPlus指定表名 若不指定自动将首字母变为小写去数据库中查询*/
@TableName("user_tab")
public class User {

    private Long id;
    private String name;
    private Integer age;
    private String email;
}
