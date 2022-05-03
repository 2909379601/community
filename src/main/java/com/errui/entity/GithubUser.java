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
     * 用户姓名
     */
    private String name;

    /**
     * 用户简介
     */
    private String bio;

    /**
     * github头像
     */
    private String avatarUrl;
}