package com.microservice.group.services;

import com.microservice.group.client.StudentClient;
import com.microservice.group.dto.StudentDto;
import com.microservice.group.entities.Group;
import com.microservice.group.http.response.StudentByGroupResponse;
import com.microservice.group.repository.IGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements IGroupService{

    @Autowired
    private IGroupRepository groupRepository;

    @Autowired
    private StudentClient studentClient;

    @Override
    public List<Group> findAll() {
        return (List<Group>) groupRepository.findAll();
    }

    @Override
    public Group findById(Long id) {
        return groupRepository.findById(id).orElseThrow();
    }

    @Override
    public void saveGroup(Group group) {
        groupRepository.save(group);
    }

    @Override
    public StudentByGroupResponse findStudentsByGroupId(Long id) {
        Group group = groupRepository.findById(id).orElseThrow();
        List<StudentDto>  students = studentClient.findAllStudentByGroup(id);
        return StudentByGroupResponse.builder()
                .groupName(group.getName())
                .teacherName(group.getTeacher())
                .studentsDto(students)
                .build();
    }


}
