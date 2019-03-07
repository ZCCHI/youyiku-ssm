package com.zc.controller;

import com.zc.damain.Student;
import com.zc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangchi
 * @create 2019-02-22
 */
@Controller
@RequestMapping("/student")
public class StudnetController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/show")
    public String findById(Model model){

        Student student = studentService.findOneById(7);

        model.addAttribute("student",student);

        return "show";
    }
}
