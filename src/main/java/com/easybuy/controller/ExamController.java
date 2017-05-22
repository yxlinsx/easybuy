/* =============================================================
 * Created: [2017年5月21日] by Allen
 * =============================================================
 *
 * Copyright 2014-2015 NetDragon Websoft Inc. All Rights Reserved
 *
 * =============================================================
 */

package com.easybuy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.common.entity.DataResult;
import com.easybuy.entity.ExamStrategyDto;
import com.easybuy.service.ExamService;

/**
 * @author Allen
 * @since
 */
@Controller
@RequestMapping({ "/" })
public class ExamController {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private ExamService examService;

    @RequestMapping(value = "/exam_strategies", method = RequestMethod.POST)
    @ResponseBody
    public DataResult<String> saveExamStrategies(@RequestBody ExamStrategyDto examStratety) {

        return examService.saveExamStrategies(examStratety);

    }

}
