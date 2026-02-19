
package com.example.validationdemo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Employee {
    //@NotBlank(message="ID Required")
    @Min(value = 1)
    private int EmpNo;
    //@NotBlank(message="First name Required")
    @Size(min = 2, max = 40)
    private String FirstName;
    //@NotBlank(message="Last name Required")
    @Size(min = 2, max = 40)
    private String LastName;
    
    public Employee(){}

    public int getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(int EmpNo) {
        this.EmpNo = EmpNo;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    

}
