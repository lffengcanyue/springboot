package com.lifei.springboot.demo.dao.mapper;

import com.lifei.springboot.demo.dao.model.User;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface UserMapper {
    @Insert({
        "insert into user_info (user_id, user_name, ",
        "phone, password)",
        "values (#{userId,jdbcType=VARCHAR}, #{userName,jdbcType=VARCHAR}, ",
        "#{phone,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR})"
    })
    int insert(User record);

    @Select({
        "select",
        "user_id, user_name, phone, password",
        "from user_info"
    })
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR)
    })
    List<User> selectAll();
}