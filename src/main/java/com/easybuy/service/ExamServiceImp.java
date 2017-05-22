/* =============================================================
 * Created: [2016年5月9日] by Administrator
 * =============================================================
 *
 * Copyright 2014-2015 NetDragon Websoft Inc. All Rights Reserved
 *
 * =============================================================
 */

package com.easybuy.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.common.entity.DataResult;
import com.easybuy.dao.ExamDao;
import com.easybuy.entity.ExamStrategy;
import com.easybuy.entity.ExamStrategyDto;
import com.easybuy.entity.ExamTopic;
import com.easybuy.entity.ExamTopicDetail;

/**
 * @author Administrator
 * @since
 */
@Service(value = "examService")
public class ExamServiceImp implements ExamService {

    @Autowired
    private ExamDao examDao;

    /*
     * (non-Javadoc)
     * @see com.exam.service.ExamService#saveExamStrategies(com.exam.entity.ExamStrategyDto)
     */
    @Override
    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRED)
    public DataResult<String> saveExamStrategies(ExamStrategyDto examStratety) {

        DataResult<String> result = null;
        try {
            ExamStrategy es = new ExamStrategy();

            List<ExamTopic> ets = examStratety.getExamTopics();
            int totalQuCnt = 0;
            int totalScore = 0;

            for (int i = 0; i < ets.size(); i++) {
                ExamTopic et = ets.get(0);
                et.setSortNumber(i + 1);
                List<ExamTopicDetail> etds = et.getExamTopicDetails();
                int quCnt = 0;
                for (ExamTopicDetail etd : etds) {
                    quCnt += etd.getQuestionCount();
                }
                et.setQuestionCount(quCnt);
                totalQuCnt += quCnt;
                totalScore += (et.getSingleScore() * quCnt);
            }

            es.setCutoffScore(examStratety.getCutoffScore());
            JSONArray diffculty = JSONArray.fromObject(examStratety.getDifficultySettings());
            es.setDifficultySetting(diffculty.toString());
            es.setQuestionCount(totalQuCnt);
            es.setTotalScore(totalScore);

            examDao.saveExamStrategy(es);

            for (ExamTopic et : ets) {
                et.setStrategyId(es.getId());
                examDao.saveExamTopic(et);
                List<ExamTopicDetail> etds = et.getExamTopicDetails();
                for (ExamTopicDetail etd : etds) {
                    etd.setTopicId(et.getId());
                }

                Map<String, Object> map = new HashMap<String, Object>();
                map.put("topicId", et.getId());
                map.put("list", et.getExamTopicDetails());
                examDao.saveExamTopicDetails(map);

            }

            Map<String, Object> map = new HashMap<String, Object>();
            map.put("strategyId", es.getId());
            map.put("list", examStratety.getQuestionBanks());

            examDao.saveExamStrategyQuestionBank(map);

            result = new DataResult<String>(1, "", "添加成功");

        } catch (Exception e) {

            result = new DataResult("添加失败");

        }

        return result;
    }
}
