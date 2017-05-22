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
public class ExamStrategy implements Serializable {

    private static final long serialVersionUID = -7909293834786200661L;

    // 自增Id
    private long id;

    // 试卷总题数
    private int questionCount;

    // 试卷总分
    private int totalScore;

    // 合格分数
    private int cutoffScore;

    // 难度设置
    private String difficultySetting;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(int questionCount) {
        this.questionCount = questionCount;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getCutoffScore() {
        return cutoffScore;
    }

    public void setCutoffScore(int cutoffScore) {
        this.cutoffScore = cutoffScore;
    }

    public String getDifficultySetting() {
        return difficultySetting;
    }

    public void setDifficultySetting(String difficultySetting) {
        this.difficultySetting = difficultySetting;
    }

}
