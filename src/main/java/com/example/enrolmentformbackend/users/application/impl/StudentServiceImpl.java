package com.example.enrolmentformbackend.users.application.impl;

import com.example.enrolmentformbackend.users.application.UsersService;
import com.example.enrolmentformbackend.users.db.StudentJpaRepository;
import com.example.enrolmentformbackend.users.domain.Student;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {
    private StudentJpaRepository studentJpaRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentJpaRepository.save(student);
    }
}
