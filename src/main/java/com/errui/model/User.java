package com.errui.model;

import lombok.Data;

/**
 * @Author: Erruihhh
 * @Date: 2022/5/1
 * @Time: 19:59
 * @PROJECT_NAME: community
 * @Description:
 */
@Data
public class User {

    /**
     * ID
     */
    private Integer id;

    /**
     * name
     */
    private String name;

    /**
     * accountId
     */
    private String accountId;

    /**
     * token
     */
    private String token;

    /**
     * gmtCreate
     */
    private Long gmtCreate;

    /**
     * gntModified
     */
    private Long gmtModified;
}