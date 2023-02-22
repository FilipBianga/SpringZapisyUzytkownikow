package com.example.enrolmentformbackend.users.application.impl;

import com.example.enrolmentformbackend.users.application.ProfessorService;
import com.example.enrolmentformbackend.users.db.ProfessorJpaRepository;
import com.example.enrolmentformbackend.users.domain.Professor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProfessorServiceImpl implements ProfessorService {
    private ProfessorJpaRepository professorJpaRepository;

    @Override
    public Professor saveProfessor(Professor professor) {
        return professorJpaRepository.save(professor);
    }

    @Override
    public List<Professor> getAllProfessor() {
        return professorJpaRepository.findAll();
    }

    @Override
    public Professor getProfessorById(Long id) {
        return professorJpaRepository.findById(id)
                .orElseThrow();
    }

    @Override
    public Professor updateProfessor(Professor professor, Long id) {
        Professor existingProfessor = professorJpaRepository.findById(id).orElseThrow();

        existingProfessor.setFirstname(professor.getFirstname());
        existingProfessor.setSurname(professor.getSurname());
        existingProfessor.setEmail(professor.getEmail());
        existingProfessor.setFaculty(existingProfessor.getFaculty());
        existingProfessor.setDepartament(professor.getDepartament());
        existingProfessor.setClasses(existingProfessor.getClasses());

        professorJpaRepository.save(existingProfessor);

        return existingProfessor;
    }

    @Override
    public void removeProfessorById(Long id) {
        professorJpaRepository.findById(id).orElseThrow();
        professorJpaRepository.deleteById(id);
    }
}
