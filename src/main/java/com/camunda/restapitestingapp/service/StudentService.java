package com.camunda.restapitestingapp.service;

import org.springframework.stereotype.Service;
import com.camunda.restapitestingapp.model.Student;
import java.util.List;

import java.util.ArrayList;

@Service
public class StudentService {

    public List<Student> getStudent() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"C", 50L));
        studentList.add(new Student(2,"C++", 60L));
        studentList.add(new Student(3,"Java", 80L));
        studentList.add(new Student(4,"JavaScript", 40L));
        studentList.add(new Student(5,"Python", 55L));
        return studentList;
    }
}
