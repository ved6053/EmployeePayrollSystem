package com.payroll.employee.service;

import com.payroll.employee.dao.CommissionedEmployeeRepository;
import com.payroll.employee.dao.EmployeeRepository;
import com.payroll.employee.dto.EmployeeDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class CommissionedEmployee extends Employee implements EmployeePayClassification{
    private Double basePay;
    private Double commissionRate;

    private final CommissionedEmployeeRepository commissionedEmployeeRepository = new CommissionedEmployeeRepository();
    public  CommissionedEmployee(EmployeeDTO employee){
      super(employee.getName(), employee.getAddress());
        this.basePay = employee.getCommissionRate();
    }
    @Override
    public void calculatePay() {

    }

    public void add(){
        commissionedEmployeeRepository.save(this);
    }
}
