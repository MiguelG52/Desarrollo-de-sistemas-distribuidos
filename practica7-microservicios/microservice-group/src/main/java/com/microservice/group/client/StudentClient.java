package com.microservice.group.client;

import com.microservice.group.dto.StudentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-student", url = "localhost:8080/api/student")
public interface StudentClient {

    @GetMapping("search-by-group/{groupId}")
    List<StudentDto> findAllStudentByGroup(@PathVariable Long groupId);
}
