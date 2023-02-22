package com.example.enrolmentformbackend.users.db;

import com.example.enrolmentformbackend.users.domain.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorJpaRepository extends JpaRepository<Professor, Long> {
}
