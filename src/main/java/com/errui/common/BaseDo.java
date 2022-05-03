package com.errui.common;

import lombok.Data;

/**
 * @Author: Erruihhh
 * @Date: 2022/5/3
 * @Time: 15:03
 * @PROJECT_NAME: community
 * @Description:
 */
@Data
public class BaseDo {

    /**
     * 创建人
     */
    private Long gmtCreate;

    /**
     * 修改人
     */
    private Long gmtModified;
}