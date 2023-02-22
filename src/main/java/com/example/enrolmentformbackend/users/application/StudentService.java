package com.example.enrolmentformbackend.users.application;

import com.example.enrolmentformbackend.users.domain.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);

    List<Student> getAllStudent();

    Student getStudentById(Long id);

    Student updateStudent(Student student, Long id);

    void removeStudentById(Long id);
}
