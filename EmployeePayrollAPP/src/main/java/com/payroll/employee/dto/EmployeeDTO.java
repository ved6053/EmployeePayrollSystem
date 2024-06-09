package com.payroll.employee.dto;

import lombok.Data;

@Data
public class EmployeeDTO {
    private String name;
    private String address;
    private EmployeeType employeeType;
    private Double basePay;
    private Double commissionRate;
    private Double monthlyRate;
    private Double hourlyRate;
}
