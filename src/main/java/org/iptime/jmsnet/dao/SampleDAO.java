/*
 * @(#)SampleDAO.java $version 2015-10-29
 *
 * Copyright 2007 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package org.iptime.jmsnet.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author minsung.jung
 */
@Repository
public class SampleDAO {
    @Autowired
    private SqlSessionTemplate sqlSession;

    public List<Map<String, Object>> selectUserList(){
        return sqlSession.selectList("mybatis.rollbook.selectUserList");
    }
}
