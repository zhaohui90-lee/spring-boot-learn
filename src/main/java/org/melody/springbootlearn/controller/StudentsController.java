package org.melody.springbootlearn.controller;

import org.melody.springbootlearn.exception.UserNotExistException;
import org.melody.springbootlearn.pojo.Students;

/**
 * @Author: melody
 * @Date: 2020-10-23
 */
public interface StudentsController {

    /**
     * 添加
     * @param student
     * @return
     */
    boolean addStudents(Students student);

    /**
     * 删除
     * @param id
     * @return
     */
    boolean delStudents(String id);

    /**
     * 查找
     * @param id
     * @return
     */
    String selectStudent(String id);

    /**
     * 修改
     * @param id
     * @return
     */
    Students modifyStudent(String id);
}
