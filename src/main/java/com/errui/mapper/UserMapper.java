package com.errui.mapper;

import com.errui.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: Erruihhh
 * @Date: 2022/5/1
 * @Time: 18:35
 * @PROJECT_NAME: community
 * @Description:
 */
@Mapper
public interface UserMapper {
    @Insert("insert into USER(name, ACCOUNT_ID, TOKEN, GMT_CREATE, GMT_MODIFIED, AVATAR_URL) values (#{name}, #{accountId}, #{token}, #{gmtCreate}, #{gmtModified}, #{avatarUrl})")
    void insert(User user);

    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);

    @Select("select * from user where ID = #{id}")
    User findById(@Param("id") Integer id);
}