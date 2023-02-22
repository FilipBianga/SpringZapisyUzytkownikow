package com.example.enrolmentformbackend.users.db;

import com.example.enrolmentformbackend.users.domain.PhD_Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhD_StudentJpaRepository extends JpaRepository<PhD_Student, Long> {
}
