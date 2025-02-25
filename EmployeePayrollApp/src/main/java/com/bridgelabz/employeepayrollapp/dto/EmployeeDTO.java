package com.bridgelabz.employeepayrollapp.dto;

public class EmployeeDTO {
    private String name;
    private int salary;

    // Default Constructor
    public EmployeeDTO() {}

    // Parameterized Constructor
    public EmployeeDTO(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{name='" + name + "', salary=" + salary + "}";
    }
}
