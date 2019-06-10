package com.qf.exception.controller;

import com.qf.exception.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("one")
public class OneController {

    @RequestMapping("sorry")
    public String exception(@Valid Student student){
        Student student1=new Student(student.getId(),student.getName());
        return "hello, world";
    }
}
