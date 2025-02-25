package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeeController {

    @GetMapping("/")
    public String getAllEmployees() {
        return "Fetching all employees";
    }

    @GetMapping("/get/{id}")
    public String getEmployeeById(@PathVariable int id) {
        return "Fetching employee with ID: " + id;
    }

    @PostMapping("/create")
    public  EmployeeDTO createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeDTO;
    }

    @PutMapping("/update")
    public EmployeeDTO updateEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeDTO;
    }

    @DeleteMapping("/delete/{id}")
    public EmployeeDTO deleteEmployee(@PathVariable int id) {
        return new EmployeeDTO("Deleted Employee", 0);
    }
}
