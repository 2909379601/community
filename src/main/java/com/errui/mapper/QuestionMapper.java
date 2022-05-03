package com.errui.mapper;

import com.errui.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: Erruihhh
 * @Date: 2022/5/3
 * @Time: 14:49
 * @PROJECT_NAME: community
 * @Description:
 */
@Mapper
public interface QuestionMapper {

    @Insert("insert into question(title, description, gmt_create, gmt_modified, creator, tag) values(#{title}, #{description}, #{gmtCreate}, #{gmtModified}, #{creator}, #{tag})")
    void create(Question question);

    @Select("select * from QUESTION")
    List<Question> list();
}