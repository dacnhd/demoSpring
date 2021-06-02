package com.example.demospring.controller;

import com.example.demospring.entity.Employee;
import com.example.demospring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Employee> getList(){
        List<Employee> employees=(List<Employee>) employeeRepository.findAll();
        return employees;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Employee create(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
}
