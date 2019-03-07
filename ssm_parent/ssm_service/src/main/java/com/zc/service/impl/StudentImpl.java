package com.zc.service.impl;

import com.zc.damain.Student;
import com.zc.dao.StudentDao;
import com.zc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author zhangchi
 * @create 2019-02-22
 */
@Service
@Transactional
public class StudentImpl implements StudentService {

    @Autowired
    public StudentDao studentDao;

    @Override
    public Student findOneById(int id) {

        return studentDao.findOneById(7);
    }
}
