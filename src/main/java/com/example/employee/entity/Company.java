package com.example.employee.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {
    @Id
    private int id;
    private String companyName;
    private int employeesNumber;

    public Company(int id, String companyName, int employeesNumber) {
        this.id = id;
        this.companyName = companyName;
        this.employeesNumber = employeesNumber;
    }

    public Company() {
    }

    public int getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getEmployeesNumber() {
        return employeesNumber;
    }
}
