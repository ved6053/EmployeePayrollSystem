package com.payroll.employee.dao;

import com.payroll.employee.exception.EmployeeDAOException;
import com.payroll.employee.service.Employee;

public interface EmployeeRepository<E extends Employee> {
    void save(E employee) throws EmployeeDAOException;
}
