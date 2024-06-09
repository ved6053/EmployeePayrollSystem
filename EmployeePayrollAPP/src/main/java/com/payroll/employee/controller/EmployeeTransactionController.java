package com.payroll.employee.controller;

import com.payroll.employee.dto.EmployeeDTO;
import com.payroll.employee.exception.EmployeeException;
import com.payroll.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController("/api/employee")
public class EmployeeTransactionController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<?> addEmployee(EmployeeDTO employeeDTO) throws EmployeeException {
        employeeService.addEmployee(employeeDTO);
        Map<String, String> map = new HashMap<>();
        map.put("success", "true");
        return new ResponseEntity<>(map, HttpStatus.ACCEPTED);
    }
}



