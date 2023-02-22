package com.example.enrolmentformbackend.users.application.impl;

import com.example.enrolmentformbackend.users.application.PhD_StudentService;
import com.example.enrolmentformbackend.users.db.PhD_StudentJpaRepository;
import com.example.enrolmentformbackend.users.domain.PhD_Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PhD_StudentServiceImpl implements PhD_StudentService {
    private PhD_StudentJpaRepository phD_studentJpaRepository;

    @Override
    public PhD_Student savePhDStudent(PhD_Student phD_student) {
        return phD_studentJpaRepository.save(phD_student);
    }

    @Override
    public List<PhD_Student> getAllPhDStudent() {
        return phD_studentJpaRepository.findAll();
    }

    @Override
    public PhD_Student getPhDStudentById(Long id) {
        return phD_studentJpaRepository.findById(id)
                .orElseThrow();
    }

    @Override
    public PhD_Student updatePhDStudent(PhD_Student phD_student, Long id) {
        PhD_Student existingPhDStudent = phD_studentJpaRepository.findById(id)
                .orElseThrow();

        existingPhDStudent.setFirstname(phD_student.getFirstname());
        existingPhDStudent.setSurname(phD_student.getSurname());
        existingPhDStudent.setEmail(phD_student.getEmail());
        existingPhDStudent.setFaculty(phD_student.getFaculty());
        existingPhDStudent.setDepartament(phD_student.getDepartament());

        phD_studentJpaRepository.save(existingPhDStudent);

        return existingPhDStudent;
    }

    @Override
    public void removePhDStudentById(Long id) {
        phD_studentJpaRepository.findById(id).orElseThrow();
        phD_studentJpaRepository.deleteById(id);
    }
}
