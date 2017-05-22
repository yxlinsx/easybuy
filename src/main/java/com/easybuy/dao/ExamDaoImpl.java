package com.easybuy.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.common.dao.BaseDao;
import com.easybuy.entity.ExamStrategy;
import com.easybuy.entity.ExamTopic;

@Repository(value = "examDao")
public class ExamDaoImpl implements ExamDao {

    private BaseDao<Integer, Integer> baseDao;

    private String namespace = "Exam.";

    @Autowired
    public ExamDaoImpl(@Qualifier("baseDao") BaseDao<Integer, Integer> baseDao) {
        this.baseDao = baseDao;

    }

    /*
     * (non-Javadoc)
     * @see com.exam.dao.ExamDao#saveExamStrategy(com.exam.entity.ExamStrategy)
     */
    @Override
    public int saveExamStrategy(ExamStrategy es) {
        return baseDao.save("saveExamStrategy", es);
    }

    /*
     * (non-Javadoc)
     * @see com.exam.dao.ExamDao#saveExamTopics(java.util.Map)
     */
    @Override
    public int saveExamTopic(ExamTopic et) {
        return baseDao.save("saveExamTopic", et);
    }

    /*
     * (non-Javadoc)
     * @see com.exam.dao.ExamDao#saveExamTopicDetails(java.util.Map)
     */
    @Override
    public int saveExamTopicDetails(Map<String, Object> map) {
        return baseDao.save("saveExamTopicDetails", map);
    }

    /*
     * (non-Javadoc)
     * @see com.exam.dao.ExamDao#saveExamStrategyQuestionBank(com.exam.entity.ExamStrategyQuestionBank)
     */
    @Override
    public int saveExamStrategyQuestionBank(Map<String, Object> map) {
        return baseDao.save("saveExamStrategyQuestionBank", map);
    }

}
