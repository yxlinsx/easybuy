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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Lsx
 * @since 0.1.0
 */
public class ExamTopicDetail implements Serializable {

    private static final long serialVersionUID = -6456233179352604358L;

    private long id;

    // 大题ID
    @JsonProperty("topic_id")
    private long topicId;

    // 知识点ID
    @JsonProperty("knowledge_id")
    private long knowledgeId;

    // 出题数
    @JsonProperty("question_count")
    private long questionCount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTopicId() {
        return topicId;
    }

    public void setTopicId(long topicId) {
        this.topicId = topicId;
    }

    public long getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(long knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    public long getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(long questionCount) {
        this.questionCount = questionCount;
    }

}
