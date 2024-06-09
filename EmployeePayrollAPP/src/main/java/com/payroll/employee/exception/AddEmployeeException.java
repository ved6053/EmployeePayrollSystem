package com.payroll.employee.exception;

public class AddEmployeeException  extends EmployeeException{

    public AddEmployeeException(String message) {
        super(message);
    }

    public AddEmployeeException(String message, Throwable cause) {
        super(message, cause);
    }
}
