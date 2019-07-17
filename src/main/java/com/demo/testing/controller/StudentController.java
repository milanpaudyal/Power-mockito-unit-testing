package com.demo.testing.controller;

/*
 @author Milan Paudyal
 @since 7/17/19, Wed
*/

import com.demo.testing.exception.StudentNotFoundException;
import com.demo.testing.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public String greetStudent(@PathVariable Integer id) throws StudentNotFoundException {
        return studentService.greetStudent(id);
    }

}
