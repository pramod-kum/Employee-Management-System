package com.geekster.EmployeeManagementSystem.service;

import com.geekster.EmployeeManagementSystem.model.EmployeeSelfService;
import com.geekster.EmployeeManagementSystem.repository.IEmployeeSelfService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeSelfServiceServiceService {
    @Autowired
    private IEmployeeSelfService iEmployeeSelfService;

    public String saveEmployee(EmployeeSelfService employeeObj) {
        iEmployeeSelfService.save(employeeObj);
        return "Employee added Successfully";
    }

    public List<EmployeeSelfService> getEmployee(Integer id) {
        return iEmployeeSelfService.findByemployeeServiceId(id);
    }
    @Transactional
    public String putEmployee(EmployeeSelfService employeeObj) {
        iEmployeeSelfService.updateEmployee(employeeObj.getEmployeeServiceId(),employeeObj.getEmployeeName(),employeeObj.getEmployeeAge(),employeeObj.getEmployeeAddress());
        return "Employee updated successfully!!";
    }
   @Transactional
    public String deleteEmployee(Integer id) {
        iEmployeeSelfService.deleteByEmployeeServiceId(id);
        return "Employee deleted successfully";
    }
}
