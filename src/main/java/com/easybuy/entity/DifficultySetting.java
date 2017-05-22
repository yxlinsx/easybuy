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
public class DifficultySetting implements Serializable {

    private static final long serialVersionUID = 7390771956457070563L;

    // 难度（1:简单，2：中等，3：困难）
    private int difficulty;

    // 占比
    private int percent;

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

}
