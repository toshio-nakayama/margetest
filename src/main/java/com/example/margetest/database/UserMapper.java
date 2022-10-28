package com.example.margetest.database;

import static com.example.margetest.database.UserDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.example.margetest.database.User;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface UserMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<User>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, age, profile);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="profile", property="profile", jdbcType=JdbcType.VARCHAR)
    })
    List<User> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserResult")
    Optional<User> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user")
    default int insert(User row) {
        return MyBatis3Utils.insert(this::insert, row, user, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(age).toProperty("age")
            .map(profile).toProperty("profile")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user")
    default int insertMultiple(Collection<User> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, user, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(age).toProperty("age")
            .map(profile).toProperty("profile")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user")
    default int insertSelective(User row) {
        return MyBatis3Utils.insert(this::insert, row, user, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(age).toPropertyWhenPresent("age", row::getAge)
            .map(profile).toPropertyWhenPresent("profile", row::getProfile)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user")
    default Optional<User> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user")
    default List<User> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user")
    default List<User> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user")
    default Optional<User> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user")
    static UpdateDSL<UpdateModel> updateAllColumns(User row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(name).equalTo(row::getName)
                .set(age).equalTo(row::getAge)
                .set(profile).equalTo(row::getProfile);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(User row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(name).equalToWhenPresent(row::getName)
                .set(age).equalToWhenPresent(row::getAge)
                .set(profile).equalToWhenPresent(row::getProfile);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user")
    default int updateByPrimaryKey(User row) {
        return update(c ->
            c.set(name).equalTo(row::getName)
            .set(age).equalTo(row::getAge)
            .set(profile).equalTo(row::getProfile)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user")
    default int updateByPrimaryKeySelective(User row) {
        return update(c ->
            c.set(name).equalToWhenPresent(row::getName)
            .set(age).equalToWhenPresent(row::getAge)
            .set(profile).equalToWhenPresent(row::getProfile)
            .where(id, isEqualTo(row::getId))
        );
    }
}