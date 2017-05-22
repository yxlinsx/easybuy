package com.easybuy.service;

import com.common.entity.DataResult;
import com.easybuy.entity.ExamStrategyDto;

public interface ExamService {

    public DataResult<String> saveExamStrategies(ExamStrategyDto examStratety);
}
