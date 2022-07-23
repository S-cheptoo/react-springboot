package com.sandra.springboot.service;

import com.sandra.springboot.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
