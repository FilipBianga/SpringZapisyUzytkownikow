package com.example.enrolmentformbackend.users.db;

import com.example.enrolmentformbackend.users.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentJpaRepository extends JpaRepository<Student, Long> {

}
