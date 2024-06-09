package com.payroll.employee.service;

import com.payroll.employee.dto.EmployeeDTO;
import com.payroll.employee.exception.AddEmployeeException;
import com.payroll.employee.exception.EmployeeDAOException;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    EmployeeTransaction employeeTransaction;
    public void addEmployee(EmployeeDTO employeeDTO) throws AddEmployeeException, EmployeeDAOException {
        employeeTransaction = new AddEmployeeTransaction(employeeDTO);
        employeeTransaction.validate();
        employeeTransaction.execute();
    }
}
