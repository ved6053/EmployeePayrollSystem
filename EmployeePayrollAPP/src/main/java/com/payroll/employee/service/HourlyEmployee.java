package com.payroll.employee.service;

import com.payroll.employee.dao.HourlyEmployeeRepository;
import com.payroll.employee.dto.EmployeeDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class HourlyEmployee extends Employee implements EmployeePayClassification{
    private Double hourlyRate;

    private final HourlyEmployeeRepository hourlyEmployeeRepository = new HourlyEmployeeRepository();
    public HourlyEmployee(EmployeeDTO employee){
        super(employee.getName(), employee.getAddress());
        this.hourlyRate = employee.getHourlyRate();
    }
    @Override
    public void calculatePay() {

    }

    @Override
    public void add() {
        hourlyEmployeeRepository.save(this);
    }
}
