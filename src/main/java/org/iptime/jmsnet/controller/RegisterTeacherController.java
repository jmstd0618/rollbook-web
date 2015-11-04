/*
 * @(#)RegisterTeacherController.java $version 2015-11-04
 *
 * Copyright 2007 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package org.iptime.jmsnet.controller;

import org.iptime.jmsnet.bo.TeacherBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @author minsung.jung
 */
@Controller
@RequestMapping("/teacher")
public class RegisterTeacherController {
    @Autowired
    private TeacherBo teacherBo;

    @RequestMapping("/registerForm")
    public String registerTeacher(Model model){
        List<Map<String, Object>> resultList = teacherBo.getAllTeacherList();
        model.addAttribute("name", "JungMinSung");
        return "teacher/registerTeacherForm";
    }

}
