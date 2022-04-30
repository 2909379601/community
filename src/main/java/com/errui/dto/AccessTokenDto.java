package com.errui.dto;

import lombok.Data;

/**
 * @Author: Erruihhh
 * @Date: 2022/4/29
 * @Time: 22:54
 * @PROJECT_NAME: community
 * @Description:
 */
@Data
public class AccessTokenDto {

    /**
     * 从 GitHub 收到的 OAuth 应用程序 的客户端 ID
     */
    private String client_id;

    /**
     * 从 GitHub 收到的 OAuth 应用程序 的客户端密钥
     */
    private String client_secret;

    /**
     * 收到的响应第 1 步的代码
     */
    private String code;

    /**
     * 用户获得授权后被发送到的应用程序中的 URL
     */
    private String redirect_uri;

    /**
     * 状态
     */
    private String state;
}