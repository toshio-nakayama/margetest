package com.example.margetest.database;

import javax.annotation.Generated;
import javax.validation.constraints.*;

public class User {

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.id")
    private Integer id;

    @NotBlank
    @Size(max = 60)
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.name")
    private String name;

    @NotNull
    @Min(18)
    @Max(150)
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.age")
    private Integer age;

    @NotBlank
    @Size(max = 254)
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.profile")
    private String profile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.age")
    public Integer getAge() {
        return age;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.age")
    public void setAge(Integer age) {
        this.age = age;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.profile")
    public String getProfile() {
        return profile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.profile")
    public void setProfile(String profile) {
        this.profile = profile;
    }
}