package com.easybuy.dao;

import java.util.Map;

import com.easybuy.entity.ExamStrategy;
import com.easybuy.entity.ExamTopic;

public interface ExamDao {
    /**
     * save
     * 
     * @param statement
     * @param parameter
     * @return
     */

    public int saveExamStrategy(ExamStrategy es);

    public int saveExamTopic(ExamTopic et);

    public int saveExamTopicDetails(Map<String, Object> map);

    public int saveExamStrategyQuestionBank(Map<String, Object> map);

}
