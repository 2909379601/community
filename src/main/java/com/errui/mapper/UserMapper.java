package com.errui.mapper;

import com.errui.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: Erruihhh
 * @Date: 2022/5/1
 * @Time: 18:35
 * @PROJECT_NAME: community
 * @Description:
 */
@Mapper
public interface UserMapper {
    @Insert("insert into USER(NAME, ACCOUNT_ID, TOKEN, GMT_CREATE, GMT_MODIFIED) values (#{name}, #{accountId}, #{token}, #{gmtCreate}, #{gmtModified})")
    void insert(User user);
}