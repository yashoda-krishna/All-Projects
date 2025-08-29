package com.example.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.*;

import java.io.Serializable;

@Entity
@IdClass(Employee.EmployeeId.class)  // Composite key
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    private int employeeId;

    @Id
    private int deptId;

    private String name;
    private int salary;
    private String email;

    // Static inner class for composite key
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class EmployeeId implements Serializable {
        private int employeeId;
        private int deptId;
    }
}
