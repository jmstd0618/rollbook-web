package org.iptime.jmsnet.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Jung-MinSung on 2015-10-31.
 */
@Repository
public class ClassDAO {
    @Autowired
    private SqlSessionTemplate sqlSession;
}
