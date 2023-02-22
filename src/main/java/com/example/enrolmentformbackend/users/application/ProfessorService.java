package com.example.enrolmentformbackend.users.application;

import com.example.enrolmentformbackend.users.domain.Professor;

import java.util.List;

public interface ProfessorService {
    Professor saveProfessor(Professor professor);

    List<Professor> getAllProfessor();

    Professor getProfessorById(Long id);

    Professor updateProfessor(Professor professor, Long id);

    void removeProfessorById(Long id);
}
