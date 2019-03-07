package com.zc.dao;

import com.zc.damain.Student;
import org.apache.ibatis.annotations.Select;

/**
 * @author zhangchi
 * @create 2019-02-22
 */
public interface StudentDao {

    @Select("select * from t_student where id = #{id}")
    public Student findOneById(int id);



}
