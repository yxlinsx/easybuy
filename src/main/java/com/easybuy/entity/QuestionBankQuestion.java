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
public class QuestionBankQuestion implements Serializable {

    private static final long serialVersionUID = -6937805058914788622L;

    private long id;

    // 题库ID
    private long questionBankId;

    // 题目ID
    private long questionId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getQuestionBankId() {
        return questionBankId;
    }

    public void setQuestionBankId(long questionBankId) {
        this.questionBankId = questionBankId;
    }

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

}
