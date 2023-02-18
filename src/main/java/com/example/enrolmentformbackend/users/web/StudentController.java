package com.example.enrolmentformbackend.users.web;

import com.example.enrolmentformbackend.users.application.impl.StudentServiceImpl;
import com.example.enrolmentformbackend.users.domain.Student;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class StudentController {
    private final StudentServiceImpl service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Student> getAllStudent() {
        return service.getAllStudent();
    }

    @GetMapping("{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") long studentId) {
        return new ResponseEntity<>(service.getStudentById(studentId), HttpStatus.OK);
    }

    @PostMapping("/student")
    public ResponseEntity<Student> saveStudentToDb(@RequestBody Student student) {
        return new ResponseEntity<>(service.saveStudent(student), HttpStatus.CREATED);
    }
}
