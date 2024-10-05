package com.camunda.restapitestingapp.controller;

import com.camunda.restapitestingapp.model.Student;
import com.camunda.restapitestingapp.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private static final Logger log = LoggerFactory.getLogger(StudentController.class);
    @Autowired
    StudentService service;

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public ResponseEntity<List<Student>> getStudent() {
        return ResponseEntity.ok(service.getStudent());
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public ResponseEntity<List<Student>> getStudents(@RequestBody String name) {
        log.info("Name:{}", name);
        return ResponseEntity.ok(service.getStudent());
    }
}
