/* =============================================================
 * Created: [2016年3月25日] by ZhengChen
 * =============================================================
 *
 * Copyright 2014-2015 NetDragon Websoft Inc. All Rights Reserved
 *
 * =============================================================
 */

package com.easybuy.entity;

import java.io.Serializable;

/**
 * @author Lsx
 * @since 0.1.0
 */
public class KnowledgeHierarchy implements Serializable {

    private static final long serialVersionUID = 2954792988404303729L;

    private long id;

    // 知识体系名称
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
