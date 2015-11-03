package org.iptime.jmsnet.dao;

import org.iptime.jmsnet.common.DaoConstants;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jung-MinSung on 2015-10-31.
 */
@Repository
public class TeacherDao {
    @Autowired
    private SqlSessionTemplate sqlSession;

    public void insertTeacher(String name, String birthDay, String phoneNo, Integer classId){
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("name", name);
        params.put("birthDay", birthDay);
        params.put("phoneNo", phoneNo);
        params.put("classId", classId);

        sqlSession.insert(DaoConstants.NAMESPACE_TEACHER + "insertTeacher", params);
    }

    /**
     * ������ ������ Update�Ѵ�.
     * (class_id�� class table�� �ܷ�Ű�̹Ƿ� �߸��� ���� �Է½� ������ �߻��� �� �ִ�.)
     * @param teacherId
     * @param name
     * @param birthDay
     * @param phoneNo
     * @param classId
     */
    public void updateTeacher(int teacherId, String name, String birthDay, String phoneNo, Integer classId){
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("teacherId", teacherId);
        params.put("name", name);
        params.put("birthDay", birthDay);
        params.put("phoneNo", phoneNo);
        params.put("classId", classId);

        sqlSession.update(DaoConstants.NAMESPACE_TEACHER + "updateTeacher", params);

    }
}
