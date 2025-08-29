package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	// CREATE new Employee
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}

	// READ - get all Employees
	@GetMapping
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	
	@GetMapping("/employee/{employeeId}")
    public List<Employee> getEmployeesByEmployeeId(@PathVariable int employeeId) {
        return employeeRepository.findByEmployeeId(employeeId);
    }
	
	@GetMapping("/department/{deptId}")
	public List<Employee> getEmployeesByDeptId(@PathVariable int deptId) {
	    return employeeRepository.findByDeptId(deptId);
	}



	// READ - get Employee by composite key (employeeId + deptId)
//	@GetMapping("/{employeeId}/{deptId}")
//	public Optional<Employee> getEmployee(@PathVariable int employeeId, @PathVariable int deptId) {
//		Employee.EmployeeId id = new Employee.EmployeeId(employeeId, deptId);
//		return employeeRepository.findById(id);
//	}

	// UPDATE Employee
	@PutMapping("/{employeeId}/{deptId}")
	public Employee updateEmployee(@PathVariable int employeeId, @PathVariable int deptId,
			@RequestBody Employee employee) {
		// set the IDs explicitly so they don’t change
		employee.setEmployeeId(employeeId);
		employee.setDeptId(deptId);
		return employeeRepository.save(employee);
	}

	// DELETE Employee
	@DeleteMapping("/{employeeId}/{deptId}")
	public String deleteEmployee(@PathVariable int employeeId, @PathVariable int deptId) {
		Employee.EmployeeId id = new Employee.EmployeeId(employeeId, deptId);
		employeeRepository.deleteById(id);
		return "Employee deleted successfully!";
	}
}
