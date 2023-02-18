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
@Table(name = "student")
public class Student extends BaseEntity {

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "surname")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column(name = "nr_album")
    private int nr_album;

    @Column(name = "course")
    private String course;
}
