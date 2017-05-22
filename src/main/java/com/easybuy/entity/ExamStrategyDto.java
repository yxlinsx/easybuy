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
public class ExamStrategyDto implements Serializable {

    private static final long serialVersionUID = 2332449641361943667L;

    // 题库
    @JsonProperty("question_banks")
    private List<QuestionBank> questionBanks;

    // 合格分数
    @JsonProperty("cutoff_score")
    private int cutoffScore;

    // 大题
    @JsonProperty("exam_topics")
    private List<ExamTopic> examTopics;

    // 难度设置
    @JsonProperty("difficulty_setting")
    private List<DifficultySetting> difficultySettings;

    public List<QuestionBank> getQuestionBanks() {
        return questionBanks;
    }

    public void setQuestionBanks(List<QuestionBank> questionBanks) {
        this.questionBanks = questionBanks;
    }

    public int getCutoffScore() {
        return cutoffScore;
    }

    public void setCutoffScore(int cutoffScore) {
        this.cutoffScore = cutoffScore;
    }

    public List<ExamTopic> getExamTopics() {
        return examTopics;
    }

    public void setExamTopics(List<ExamTopic> examTopics) {
        this.examTopics = examTopics;
    }

    public List<DifficultySetting> getDifficultySettings() {
        return difficultySettings;
    }

    public void setDifficultySettings(List<DifficultySetting> difficultySettings) {
        this.difficultySettings = difficultySettings;
    }

}
