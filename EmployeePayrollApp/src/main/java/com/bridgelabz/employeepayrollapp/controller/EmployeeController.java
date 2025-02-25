package com.bridgelabz.employeepayrollapp.controller;



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
    public String createEmployee(@RequestBody String employee) {
        return "Employee created: " + employee;
    }

    @PutMapping("/update")
    public String updateEmployee(@RequestBody String employee) {
        return "Employee updated: " + employee;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return "Employee with ID " + id + " deleted";
    }
}
