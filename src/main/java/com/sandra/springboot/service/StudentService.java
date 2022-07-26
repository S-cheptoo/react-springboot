package com.sandra.springboot.service;

import com.sandra.springboot.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public void saveStudent(Student student);
    public List<Student> getAllStudents();
//    public Optional<Student> findById(Integer id);
//    public void deleteById(Integer id);
}
