package com.sandra.springboot.service;

import com.sandra.springboot.model.Student;
import com.sandra.springboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

//    @Override
//    public Optional<Student> findById(Integer id) {
//        return studentRepository.findById(id);
//    }
//
//    @Override
//    public void deleteById(Integer id) {
//    }
}
