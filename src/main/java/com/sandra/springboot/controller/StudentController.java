package com.sandra.springboot.controller;

import com.sandra.springboot.model.Student;
import com.sandra.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
//tells the React application to connect two applications
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student added";
    }
//fetching all students
    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
//get a single student
//@GetMapping("/{id}")
//Optional<Student> one(Integer id) {
//    return studentService.findById(id);
//}
// delete
//    @DeleteMapping("/{id}")
//    void deleteStudent(@PathVariable Integer id) {
//        studentService.deleteById(id);
//    }

}
