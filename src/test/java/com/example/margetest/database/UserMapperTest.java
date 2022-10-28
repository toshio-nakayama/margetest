package com.example.margetest.database;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import static org.assertj.core.api.Assertions.assertThat;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@MybatisTest
class UserMapperTest {

    @Autowired
    UserMapper mapper;

    @Test
    void deleteByPrimaryKey() {
        assertThat(mapper.selectByPrimaryKey(1).map(User::getName).orElse("")).isEqualTo("Ichiro");
    }
}