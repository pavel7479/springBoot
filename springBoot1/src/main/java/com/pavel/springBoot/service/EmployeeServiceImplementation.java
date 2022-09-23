package com.pavel.springBoot.service;

import com.pavel.springBoot.dao.EmployeeRepository;
import com.pavel.springBoot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    @Transactional
    public Employee getEmployee(int id) {
        Employee employee = null;
        Optional<Employee> optional = employeeRepository.findById(id);
        if (optional.isPresent()) employee = optional.get();
        else new Throwable("Not found employee with id = " + id);
        return employee;
    }
    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

// My variant
//    @Override
//    @Transactional
//    public void deleteEmployee(Employee employee) {
//        employeeDAO.deleteEmployee(employee);
//    }
}