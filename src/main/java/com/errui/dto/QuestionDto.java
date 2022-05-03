package com.errui.dto;

import com.errui.model.User;
import lombok.Data;

/**
 * @Author: Erruihhh
 * @Date: 2022/5/3
 * @Time: 21:29
 * @PROJECT_NAME: community
 * @Description:
 */
@Data
public class QuestionDto {
    /**
     *
     */
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 描述
     */
    private String description;

    /**
     * 标签
     */
    private String tag;

    /**
     * 创建人
     */
    private Integer creator;

    /**
     * 阅读数
     */
    private Integer viewCount;

    /**
     * 评论数
     */
    private Integer commentCount;

    /**
     * 点赞数
     */
    private Integer likeCount;

    private User user;
}