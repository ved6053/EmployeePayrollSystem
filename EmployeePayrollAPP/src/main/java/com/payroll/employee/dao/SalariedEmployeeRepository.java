package com.payroll.employee.dao;

import com.payroll.employee.exception.EmployeeDAOException;
import com.payroll.employee.service.SalariedEmployee;

public class SalariedEmployeeRepository implements EmployeeRepository<SalariedEmployee> {
    @Override
    public void save(SalariedEmployee employee) throws EmployeeDAOException {

    }
}
