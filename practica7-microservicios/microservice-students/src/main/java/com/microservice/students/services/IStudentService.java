package com.microservice.students.services;

import com.microservice.students.entities.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    Student findById(Long id);
    void save(Student student);
    List<Student> findByGroupId(Long groupId);
}
