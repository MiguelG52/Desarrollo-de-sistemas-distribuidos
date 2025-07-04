package com.microservice.group.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class StudentDto {

    private String name;
    private String lastName;
    private Float grade;
    private Long groupId;

}
