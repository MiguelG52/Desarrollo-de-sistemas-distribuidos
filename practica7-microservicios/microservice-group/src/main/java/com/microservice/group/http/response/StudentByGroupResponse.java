package com.microservice.group.http.response;


import com.microservice.group.dto.StudentDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentByGroupResponse {
    private String groupName;
    private String teacherName;
    private List<StudentDto> studentsDto;
}
