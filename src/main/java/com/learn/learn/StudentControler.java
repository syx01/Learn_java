package com.learn.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentControler {
    @Autowired
    private StudentService studentService;

    @RequestMapping("")
    public List findList() {
       return studentService.findAll();
    }
}
