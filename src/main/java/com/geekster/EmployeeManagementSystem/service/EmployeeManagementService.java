package com.geekster.EmployeeManagementSystem.service;

import com.geekster.EmployeeManagementSystem.model.EmployeeManagement;
import com.geekster.EmployeeManagementSystem.repository.IEmployeeManagement;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManagementService {
    @Autowired
    private IEmployeeManagement iEmployeeManagement;

    public String addEmployeeSalary(EmployeeManagement employeeManagementObj) {
        iEmployeeManagement.save(employeeManagementObj);
        return "EmployeeSalaryAdded SuccessFully!!";
    }

    public EmployeeManagement getEmployeeSalary(Integer id) {
       return iEmployeeManagement.findById(id).get();

    }
    @Transactional
    public String putEmployeeSalary(EmployeeManagement employeeManagementObj) {
        iEmployeeManagement.updateemp(employeeManagementObj.getEmployeeId(),employeeManagementObj.getJobRole(),employeeManagementObj.getSalary());
        return "updated successfully!!";
    }

    public String deleteEmployeeSalary(Integer id) {
        iEmployeeManagement.deleteById(id);
        return "deleted succefully!!";
    }
}
