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
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Lsx
 * @since 0.1.0
 */
public class ExamTopic implements Serializable {

    private static final long serialVersionUID = -8033831610018609050L;

    private long id;

    // 出题策略ID
    @JsonProperty("strategy_id")
    private long strategyId;

    // 大题名称
    @JsonProperty("name")
    private String name;

    // 题型
    @JsonProperty("question_type")
    private int questionType;

    // 试卷总题数
    @JsonProperty("question_count")
    private int questionCount;

    // 每道题的分值
    @JsonProperty("single_score")
    private int singleScore;

    // 顺序号
    @JsonProperty("sort_number")
    private int sortNumber;

    // 大题出题设置
    @JsonProperty("exam_topic_details")
    private List<ExamTopicDetail> examTopicDetails;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(long strategyId) {
        this.strategyId = strategyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuestionType() {
        return questionType;
    }

    public void setQuestionType(int questionType) {
        this.questionType = questionType;
    }

    public int getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(int questionCount) {
        this.questionCount = questionCount;
    }

    public int getSingleScore() {
        return singleScore;
    }

    public void setSingleScore(int singleScore) {
        this.singleScore = singleScore;
    }

    public int getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(int sortNumber) {
        this.sortNumber = sortNumber;
    }

    public List<ExamTopicDetail> getExamTopicDetails() {
        return examTopicDetails;
    }

    public void setExamTopicDetails(List<ExamTopicDetail> examTopicDetails) {
        this.examTopicDetails = examTopicDetails;
    }

}
