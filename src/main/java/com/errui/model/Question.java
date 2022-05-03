package com.errui.model;

import com.errui.common.BaseDo;
import lombok.Data;

/**
 * @Author: Erruihhh
 * @Date: 2022/5/3
 * @Time: 14:56
 * @PROJECT_NAME: community
 * @Description:
 */
@Data
public class Question extends BaseDo {

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

}