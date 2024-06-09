package com.payroll.employee.exception;

import com.payroll.employee.service.Employee;

public class EmployeeDAOException extends EmployeeException {
    public EmployeeDAOException(String message) {
        super(message);
    }

    public EmployeeDAOException(String message, Throwable cause) {
        super(message, cause);
    }
}
