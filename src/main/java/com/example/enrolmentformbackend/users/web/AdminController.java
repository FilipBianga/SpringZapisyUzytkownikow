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

@RestController
@RequestMapping("/admin")
@AllArgsConstructor
public class AdminController {
    private final StudentService studentService;
    private final PhD_StudentService phD_studentService;
    private final ProfessorService professorService;

    // admin
    @PatchMapping("/students/{id}")
    public ResponseEntity<Student> updateStudentInDb(@PathVariable("id") Long id, @RequestBody Student student) {
        return new ResponseEntity<>(studentService.updateStudent(student, id), HttpStatus.OK);
    }

    // admin
    @PatchMapping("/phd/{id}")
    public ResponseEntity<PhD_Student> updatePhDStudentInDb(@PathVariable("id") Long id, @RequestBody PhD_Student phD_student) {
        return new ResponseEntity<>(phD_studentService.updatePhDStudent(phD_student, id), HttpStatus.OK);
    }

    // admin
    @PatchMapping("/professor/{id}")
    public ResponseEntity<Professor> updateProfessorInDb(@PathVariable("id") Long id, @RequestBody Professor professor) {
        return new ResponseEntity<>(professorService.updateProfessor(professor, id), HttpStatus.OK);
    }

    // admin
    @DeleteMapping("/students/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStudentById(@PathVariable Long id) {
        studentService.removeStudentById(id);
    }

    // admin
    @DeleteMapping("/phd/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePhDStudentById(@PathVariable Long id) {
        phD_studentService.removePhDStudentById(id);
    }

    // admin
    @DeleteMapping("/professor/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProfessorById(@PathVariable Long id) {
        professorService.removeProfessorById(id);
    }
}
