package com.geekster.EmployeeManagementSystem.controller;

import com.geekster.EmployeeManagementSystem.model.EmployeeManagement;
import com.geekster.EmployeeManagementSystem.model.EmployeeSelfService;
import com.geekster.EmployeeManagementSystem.service.EmployeeManagementService;
import com.geekster.EmployeeManagementSystem.service.EmployeeSelfServiceServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HRcontroller {
    @Autowired
    private EmployeeManagementService employeeManagementService;

    @PostMapping("/addEmployeeSalary")
    public String addEmployeeSalary(@RequestBody EmployeeManagement employeeManagementObj){
        return employeeManagementService.addEmployeeSalary(employeeManagementObj);
    }
    @GetMapping("/getEmployeeSalary/{id}")
    public EmployeeManagement getEmployeeSalary(@PathVariable Integer id){
        return employeeManagementService.getEmployeeSalary(id);
    }

    @PutMapping("/putEmployeeSalary")
    public String putEmployeeSalary(@RequestBody EmployeeManagement employeeManagementObj){
        return employeeManagementService.putEmployeeSalary(employeeManagementObj);
    }
    @DeleteMapping("/deleteEmployeeSalary/{id}")
    public String deleteEmployeeSalary(@PathVariable Integer id){
        return employeeManagementService.deleteEmployeeSalary(id);
    }
}
