package com.example.enrolmentformbackend.users.domain;

import com.example.enrolmentformbackend.jpa.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "phd_student")
public class PhD_Student extends BaseEntity {
    @Column(name = "first_name")
    private String firstname;

    @Column(name = "surname")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "departament")
    private String departament;

}
