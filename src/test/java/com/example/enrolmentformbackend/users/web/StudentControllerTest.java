package com.example.enrolmentformbackend.users.web;

import com.example.enrolmentformbackend.users.application.StudentService;
import com.example.enrolmentformbackend.users.domain.Student;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {StudentController.class})
class StudentControllerTest {

    @MockBean
    StudentService studentService;

    @Autowired
    StudentController controller;

    @Test
    public void getAllStudent() {
        //given
        Student filip = new Student("Filip", "Romanski", "froman@wp.pl", 18909, "IT");
        Student mati = new Student("Mateusz", "Waldos", "waldos@wp.pl", 43909, "IT");
        when(studentService.getAllStudent()).thenReturn(List.of(filip, mati));

        //when
        List<Student> students = controller.getAllStudent();

        //then
        assertEquals(2, students.size());
    }
}