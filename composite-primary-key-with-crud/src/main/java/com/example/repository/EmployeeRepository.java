package com.example.repository;

import java.util.*;

import com.example.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Employee.EmployeeId> {
	
	List<Employee> findByEmployeeId(int employeeId);
    List<Employee> findByDeptId(int deptId);
}
