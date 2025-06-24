package com.microservice.group.repository;

import com.microservice.group.entities.Group;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGroupRepository extends CrudRepository<Group,Long> {
}
