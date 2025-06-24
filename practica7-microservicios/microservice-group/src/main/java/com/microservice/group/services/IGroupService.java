package com.microservice.group.services;

import com.microservice.group.entities.Group;
import com.microservice.group.http.response.StudentByGroupResponse;

import java.util.List;

public interface IGroupService {
    List<Group> findAll();
    Group findById(Long id);
    void saveGroup(Group group);
    StudentByGroupResponse findStudentsByGroupId(Long id);

}
