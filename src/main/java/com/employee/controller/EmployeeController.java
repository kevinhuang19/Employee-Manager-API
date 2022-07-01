package com.employee.controller;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id") String employeeid) {
        return employeeRepository.getEmployeeById(employeeid);
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable("id") String employeeid) {
        return  employeeRepository.delete(employeeid);
    }
    
    @PutMapping("/employee/{id}")
    public String updateEmployee(@PathVariable("id") String employeeid, @RequestBody Employee employee) {
    	employee.setId(employeeid);
        return employeeRepository.update(employeeid,employee);
    }
}