package com.payroll.employee.service;

import com.payroll.employee.dto.EmployeeDTO;
import com.payroll.employee.exception.AddEmployeeException;
import com.payroll.employee.exception.EmployeeException;

public interface EmployeeTransaction {
    void validate();
    void execute();
}
