package com.payroll.employee.service;

import com.payroll.employee.dto.EmployeeType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract  class Employee {
    protected String name;
    protected String address;

    public Employee(String name, String address){
        this.name = name;
        this.address = address;
    }

    public abstract void add();
}
