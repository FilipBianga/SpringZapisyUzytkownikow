package com.example.enrolmentformbackend.users.web;

import com.example.enrolmentformbackend.users.application.PhD_StudentService;
import com.example.enrolmentformbackend.users.application.ProfessorService;
import com.example.enrolmentformbackend.users.application.StudentService;

import com.example.enrolmentformbackend.users.domain.PhD_Student;
import com.example.enrolmentformbackend.users.domain.Professor;
import com.example.enrolmentformbackend.users.domain.Student;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UsersController {
    private final StudentService studentService;
    private final PhD_StudentService phD_studentService;
    private final ProfessorService professorService;

    // all
    @GetMapping("/students")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }

    // all
    @GetMapping("/phd")
    @ResponseStatus(HttpStatus.OK)
    public List<PhD_Student> getAllPhDStudent() {
        return phD_studentService.getAllPhDStudent();
    }

    // all
    @GetMapping("/professor")
    @ResponseStatus(HttpStatus.OK)
    public List<Professor> getAllProfessor() {
        return professorService.getAllProfessor();
    }

    // all
    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudentByIdFromDb(@PathVariable("id") Long studentId) {
        return new ResponseEntity<>(studentService.getStudentById(studentId), HttpStatus.OK);
    }

    // all
    @GetMapping("/phd/{id}")
    public ResponseEntity<PhD_Student> getPhDStudentByIdFromId(@PathVariable("id") Long phdStudentId) {
        return new ResponseEntity<>(phD_studentService.getPhDStudentById(phdStudentId), HttpStatus.OK);
    }

    // all
    @GetMapping("/professor/{id}")
    public ResponseEntity<Professor> getProfessorByIdFromDb(@PathVariable("id") Long professorId) {
        return new ResponseEntity<>(professorService.getProfessorById(professorId), HttpStatus.OK);
    }

    // all
    @PostMapping("/students/add")
    public ResponseEntity<Student> saveStudentToDb(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.saveStudent(student), HttpStatus.CREATED);
    }

    // all
    @PostMapping("/phd/add")
    public ResponseEntity<PhD_Student> savePhDStudentToDb(@RequestBody PhD_Student phD_student) {
        return new ResponseEntity<>(phD_studentService.savePhDStudent(phD_student), HttpStatus.CREATED);
    }

    // all
    @PostMapping("/professor/add")
    public ResponseEntity<Professor> saveProfessorToDb(@RequestBody Professor professor) {
        return new ResponseEntity<>(professorService.saveProfessor(professor), HttpStatus.CREATED);
    }


}
