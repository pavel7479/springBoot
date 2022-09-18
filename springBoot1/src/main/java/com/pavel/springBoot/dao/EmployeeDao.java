package com.pavel.springBoot.dao;


import com.pavel.springBoot.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);

// My variant
//    public void deleteEmployee(Employee employee);

}