package com.microservice.group.controller;

import com.microservice.group.entities.Group;
import com.microservice.group.services.IGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/groups")
public class GroupController {
    @Autowired
    private IGroupService groupService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void SaveGroup(@RequestBody Group group) {
        groupService.saveGroup(group);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllGroups() {
        return ResponseEntity.ok(groupService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(groupService.findById(id));
    }

    @GetMapping("/searchStudentsByGroupId/{groupId}")
    public ResponseEntity<?> findAllByGroupId(@PathVariable Long groupId){
        return ResponseEntity.ok(groupService.findStudentsByGroupId(groupId));
    }
}
