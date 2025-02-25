package com.bridgelabz.employeepayrollapp.service;


import com.bridgelabz.employeepayrollapp.model.EmployeeModel;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    public List<EmployeeModel> getAllEmployees() {
        return Arrays.asList(
            new EmployeeModel("Alice", 5000),
            new EmployeeModel("Bob", 6000),
            new EmployeeModel("Charlie", 7000)
        );
    }

    public EmployeeModel getEmployeeById(int id) {
        return new EmployeeModel("Employee " + id, 5000);
    }

    public EmployeeModel createEmployee(EmployeeModel employee) {
        return employee;
    }

    public EmployeeModel updateEmployee(EmployeeModel employee) {
        return employee;
    }

    public EmployeeModel deleteEmployee(int id) {
        return new EmployeeModel("Deleted Employee", 0);
    }
}
