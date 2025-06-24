package com.microservice.students.controller;

import com.microservice.students.entities.Student;
import com.microservice.students.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student) {
        studentService.save(student);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(studentService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return  ResponseEntity.ok(studentService.findById(id));
    }

    @GetMapping("/search-by-group/{groupId}")
    public ResponseEntity<?> findStudentsByIdGroup(@PathVariable Long groupId){
        return ResponseEntity.ok(studentService.findByGroupId(groupId));
    }

}
