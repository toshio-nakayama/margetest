package com.example.margetest.database;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class UserDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user")
    public static final User user = new User();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.id")
    public static final SqlColumn<Integer> id = user.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.name")
    public static final SqlColumn<String> name = user.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.age")
    public static final SqlColumn<Integer> age = user.age;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.profile")
    public static final SqlColumn<String> profile = user.profile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user")
    public static final class User extends AliasableSqlTable<User> {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> age = column("age", JDBCType.INTEGER);

        public final SqlColumn<String> profile = column("profile", JDBCType.VARCHAR);

        public User() {
            super("user", User::new);
        }
    }
}