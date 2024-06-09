package com.payroll.employee.dto;

public enum EmployeeType {
    H("H"), S("S"), C("H");
    private final String value;
    EmployeeType(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
}
