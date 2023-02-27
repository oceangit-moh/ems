package com.ocean.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ocean.ems.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
