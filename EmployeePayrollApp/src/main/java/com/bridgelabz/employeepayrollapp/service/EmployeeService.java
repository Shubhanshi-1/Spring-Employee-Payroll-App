package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private final List<EmployeeModel> employeeList = new ArrayList<>();

    public EmployeeService() {
        // Adding some default employees
        employeeList.add(new EmployeeModel("Alice", 5000));
        employeeList.add(new EmployeeModel("Bob", 6000));
    }

    public List<EmployeeDTO> getAllEmployees() {
        List<EmployeeDTO> dtoList = new ArrayList<>();
        for (EmployeeModel emp : employeeList) {
            dtoList.add(new EmployeeDTO(emp.getName(), emp.getSalary()));
        }
        return dtoList;
    }

    public EmployeeDTO getEmployeeById(int id) {
        if (id >= 0 && id < employeeList.size()) {
            EmployeeModel emp = employeeList.get(id);
            return new EmployeeDTO(emp.getName(), emp.getSalary());
        }
        return new EmployeeDTO("Not Found", 0);
    }

    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        EmployeeModel employee = new EmployeeModel(employeeDTO.getName(), employeeDTO.getSalary());
        employeeList.add(employee);
        return employeeDTO;
    }

    public EmployeeDTO updateEmployee(int id, EmployeeDTO employeeDTO) {
        if (id >= 0 && id < employeeList.size()) {
            employeeList.set(id, new EmployeeModel(employeeDTO.getName(), employeeDTO.getSalary()));
            return employeeDTO;
        }
        return new EmployeeDTO("Not Found", 0);
    }

    public EmployeeDTO deleteEmployee(int id) {
        if (id >= 0 && id < employeeList.size()) {
            EmployeeModel removedEmployee = employeeList.remove(id);
            return new EmployeeDTO(removedEmployee.getName(), removedEmployee.getSalary());
        }
        return new EmployeeDTO("Not Found", 0);
    }
}
