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
public class Knowledge implements Serializable {

    private static final long serialVersionUID = 5596860279678542290L;

    private long id;

    // 知识体系ID
    private long knowledgeHierarchyId;

    // 知识点名称
    private String name;

    // 顺序号
    private long sortNumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getKnowledgeHierarchyId() {
        return knowledgeHierarchyId;
    }

    public void setKnowledgeHierarchyId(long knowledgeHierarchyId) {
        this.knowledgeHierarchyId = knowledgeHierarchyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(long sortNumber) {
        this.sortNumber = sortNumber;
    }

}
