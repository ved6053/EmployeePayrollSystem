package com.payroll.employee.service;

import com.payroll.employee.dao.SalariedEmployeeRepository;
import com.payroll.employee.dto.EmployeeDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class SalariedEmployee extends Employee implements EmployeePayClassification {
    private Double monthlyRate ;

  private final SalariedEmployeeRepository salariedEmployeeRepository =
      new SalariedEmployeeRepository();

    public SalariedEmployee(EmployeeDTO employee){
        super(employee.getName(), employee.getAddress());
        this.monthlyRate = employee.getMonthlyRate();
    }

    public void add(){
        salariedEmployeeRepository.save(this);
    }
    @Override
    public void calculatePay() {

    }
}
