package com.payroll.employee.service;

import com.payroll.employee.dto.EmployeeDTO;
import com.payroll.employee.exception.AddEmployeeException;
import com.payroll.employee.exception.EmployeeDAOException;
import org.springframework.stereotype.Service;

import java.util.Objects;


public class AddEmployeeTransaction implements EmployeeTransaction {
    private final EmployeeDTO employeeDTO;
    private Employee employee;
    public AddEmployeeTransaction(EmployeeDTO employeeDTO) {
        this.employeeDTO = employeeDTO;
    }
    @Override
    public void validate() throws AddEmployeeException {
        switch (employeeDTO.getEmployeeType()){
            case C-> {
                if( Objects.isNull(employeeDTO.getBasePay())||Objects.isNull(employeeDTO.getCommissionRate())||employeeDTO.getBasePay()<0.0||employeeDTO.getCommissionRate()<=0.0){
                    throw new AddEmployeeException("Hourly Employee has invalid hourly rate payment details");
                } else {
                    employee =  new CommissionedEmployee(employeeDTO);
                }
            }

            case H-> {
                if( Objects.isNull(employeeDTO.getHourlyRate())||employeeDTO.getHourlyRate()<=0.0){
                    throw new AddEmployeeException("Hourly Employee has invalid hourly rate payment details");
                } else {
                    employee =  new HourlyEmployee(employeeDTO);
                }
            }

            case S-> {
                if( Objects.isNull(employeeDTO.getMonthlyRate())||employeeDTO.getMonthlyRate()<=0.0){
                    throw new AddEmployeeException("Salaried Employee has invalid monthly rate payment details");
                } else {
                    employee =  new SalariedEmployee(employeeDTO);
                }
            }

            default -> throw new AddEmployeeException("Unexpected value: " + employeeDTO.getEmployeeType());
        }
    }

    @Override
    public void execute() throws EmployeeDAOException {
        employee.add();
    }


}
