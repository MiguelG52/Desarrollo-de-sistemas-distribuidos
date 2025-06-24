package com.microservice.students.repository;

import com.microservice.students.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {

    List<Student> findAllByGroupId(Long groupId);

}
