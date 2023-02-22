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
@RequestMapping("/api/users")
@AllArgsConstructor
public class StudentController {
    private final StudentService studentService;
    private final PhD_StudentService phD_studentService;
    private final ProfessorService professorService;

    @GetMapping("/students")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }

    @GetMapping("/phd")
    @ResponseStatus(HttpStatus.OK)
    public List<PhD_Student> getAllPhDStudent() {
        return phD_studentService.getAllPhDStudent();
    }

    @GetMapping("/professor")
    @ResponseStatus(HttpStatus.OK)
    public List<Professor> getAllProfessor() {
        return professorService.getAllProfessor();
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudentByIdFromDb(@PathVariable("id") Long studentId) {
        return new ResponseEntity<>(studentService.getStudentById(studentId), HttpStatus.OK);
    }

    @GetMapping("/phd/{id}")
    public ResponseEntity<PhD_Student> getPhDStudentByIdFromId(@PathVariable("id") Long phdStudentId) {
        return new ResponseEntity<>(phD_studentService.getPhDStudentById(phdStudentId), HttpStatus.OK);
    }

    @GetMapping("/professor/{id}")
    public ResponseEntity<Professor> getProfessorByIdFromDb(@PathVariable("id") Long professorId) {
        return new ResponseEntity<>(professorService.getProfessorById(professorId), HttpStatus.OK);
    }

    @PostMapping("/students/add")
    public ResponseEntity<Student> saveStudentToDb(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.saveStudent(student), HttpStatus.CREATED);
    }

    @PostMapping("/phd/add")
    public ResponseEntity<PhD_Student> savePhDStudentToDb(@RequestBody PhD_Student phD_student) {
        return new ResponseEntity<>(phD_studentService.savePhDStudent(phD_student), HttpStatus.CREATED);
    }

    @PostMapping("/professor/add")
    public ResponseEntity<Professor> saveProfessorToDb(@RequestBody Professor professor) {
        return new ResponseEntity<>(professorService.saveProfessor(professor), HttpStatus.CREATED);
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<Student> updateStudentInDb(@PathVariable("id") Long id, @RequestBody Student student) {
        return new ResponseEntity<>(studentService.updateStudent(student, id), HttpStatus.OK);
    }

    @PutMapping("/phd/{id}")
    public ResponseEntity<PhD_Student> updatePhDStudentInDb(@PathVariable("id") Long id, @RequestBody PhD_Student phD_student) {
        return new ResponseEntity<>(phD_studentService.updatePhDStudent(phD_student, id), HttpStatus.OK);
    }

    @PutMapping("/professor/{id}")
    public ResponseEntity<Professor> updateProfessorInDb(@PathVariable("id") Long id, @RequestBody Professor professor) {
        return new ResponseEntity<>(professorService.updateProfessor(professor, id), HttpStatus.OK);
    }

    @DeleteMapping("/students/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStudentById(@PathVariable Long id) {
        studentService.removeStudentById(id);
    }

    @DeleteMapping("/phd/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePhDStudentById(@PathVariable Long id) {
        phD_studentService.removePhDStudentById(id);
    }

    @DeleteMapping("/professor/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProfessorById(@PathVariable Long id) {
        professorService.removeProfessorById(id);
    }
}
