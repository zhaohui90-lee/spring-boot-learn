package org.melody.springbootlearn.controller;

import org.melody.springbootlearn.exception.UserNotExistException;
import org.melody.springbootlearn.pojo.Students;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: melody
 * @date: 2020-10-23
 */
@RestController
public class StudentControllerImpl implements StudentsController{

    final static Logger logger = LoggerFactory.getLogger(StudentControllerImpl.class);

    @Override
    public boolean addStudents(Students student) {
        logger.info("add student: {}", student);
        return false;
    }

    @Override
    public boolean delStudents(String id) {
        logger.info("id: {}", id);
        return false;
    }

    @Override
    @RequestMapping("/select")
    public String selectStudent(@RequestParam("id") String id) {
        if (id.equals("")){
            throw new UserNotExistException();
        }
        return "hello student";
    }

    @Override
    public Students modifyStudent(String id) {
        return null;
    }
}
