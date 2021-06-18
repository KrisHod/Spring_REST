package com.spring.rest.controller;

import com.spring.rest.entity.Employee;
import com.spring.rest.service.EmployeeService;
import com.spring.rest.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAll() {
        List<Employee> allEmployees = employeeService.getAll();
        return allEmployees;
    }
}
