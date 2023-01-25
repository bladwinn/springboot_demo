package com.example.springboot_demo01;

import com.example.springboot_demo01.mapper.UserMapper;
import com.example.springboot_demo01.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.jdbc.core.JdbcTemplate;

@Slf4j
@SpringBootTest
class SpringbootDemo01ApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserMapper userMapper;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    void contextLoads() {
        Long count = jdbcTemplate.queryForObject("select count(*) from student", Long.class);

        log.info("个数：{}",count);
    }

    @Test
    void testMybatis(){
        User user = userMapper.selectById(1);
        log.info("查询到的信息是：{}",user);

    }

    @Test
    void testRedis(){
        ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();
        stringStringValueOperations.set("hello","world");
        stringStringValueOperations.set("wdy","yyds");
        String hello = stringStringValueOperations.get("hello");
        System.out.println(hello);
    }

}
