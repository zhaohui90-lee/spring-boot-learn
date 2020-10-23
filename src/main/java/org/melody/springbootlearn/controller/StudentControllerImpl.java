package org.melody.springbootlearn.controller;

import org.melody.springbootlearn.pojo.Students;
import org.springframework.stereotype.Controller;

/**
 * @Author: melody
 * @Date: 2020-10-23
 */
@Controller
public class StudentControllerImpl implements StudentsController{
    @Override
    public boolean addStudents(Students student) {
        return false;
    }

    @Override
    public boolean delStudents(String id) {
        return false;
    }

    @Override
    public Students selectStudent(String id) {
        return null;
    }

    @Override
    public Students modifyStudent(String id) {
        return null;
    }
}
