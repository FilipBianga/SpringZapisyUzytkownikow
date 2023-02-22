package com.example.enrolmentformbackend.users.application;

import com.example.enrolmentformbackend.users.domain.PhD_Student;

import java.util.List;

public interface PhD_StudentService {
    PhD_Student savePhDStudent(PhD_Student phD_student);

    List<PhD_Student> getAllPhDStudent();

    PhD_Student getPhDStudentById(Long id);

    PhD_Student updatePhDStudent(PhD_Student phD_student, Long id);

    void removePhDStudentById(Long id);
}
