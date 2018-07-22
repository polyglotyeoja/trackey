package com.monopolardesigns.trackey.repository;

import com.monopolardesigns.trackey.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
