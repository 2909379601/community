package com.errui.entity;

import lombok.Data;

/**
 * @Author: Erruihhh
 * @Date: 2022/4/29
 * @Time: 23:39
 * @PROJECT_NAME: community
 * @Description:
 */
@Data
public class GithubUser {

    /**
     * 用户id
     */
    private Long id;

    /**
     * 用户name
     */
    private String name;

    /**
     * bio
     */
    private String bio;
}