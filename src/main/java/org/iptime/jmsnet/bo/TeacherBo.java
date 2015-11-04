/*
 * @(#)TeacherBo.java $version 2015-11-04
 *
 * Copyright 2007 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package org.iptime.jmsnet.bo;

import org.iptime.jmsnet.dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author minsung.jung
 */
@Service("teacherBo")
public class TeacherBo {
    @Autowired
    private TeacherDao teacherDao;

    public List<Map<String, Object>> getAllTeacherList(){
        return teacherDao.selectTeacherList();
    }

}
