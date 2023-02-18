package com.example.enrolmentformbackend.users.application.impl;

import com.example.enrolmentformbackend.users.application.StudentService;
import com.example.enrolmentformbackend.users.db.StudentJpaRepository;
import com.example.enrolmentformbackend.users.domain.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private StudentJpaRepository studentJpaRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentJpaRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentJpaRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentJpaRepository.findById(id)
                .orElseThrow();
    }


    // must add validation if student exist?
    public Student updateStudent(Student student, Long id) {
        return null;
    }

    @Override
    public void removeStudentById(Long id) {
        studentJpaRepository.deleteById(id);
    }

}
