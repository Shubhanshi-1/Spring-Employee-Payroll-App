package com.bridgelabz.employeepayrollapp.model;


public class EmployeeModel {
    private String name;
    private int salary;

    // Default Constructor
    public EmployeeModel() {}

    // Parameterized Constructor
    public EmployeeModel(String name, int salary) {
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
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}
