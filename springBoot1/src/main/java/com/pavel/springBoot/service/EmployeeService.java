package com.pavel.springBoot.service;

import com.pavel.springBoot.entity.Employee;
import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee (Employee employee);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);
    public List<Employee> findAllByName(String name);

// My variant
//    public void deleteEmployee(Employee employee);
}