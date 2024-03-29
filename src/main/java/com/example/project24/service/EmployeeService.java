package com.example.project24.service;

import com.example.project24.Entity.Employee;
import com.example.project24.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){

        return employeeRepository.findAll();
    }

    public Employee addEmployee(Employee employee){
        Employee employee1 = employeeRepository.save(employee);
        return employee1;
    }

    public void deleteEmployee(Long id){
        Optional<Employee> employee1 = employeeRepository.findById(id);
        Employee employee2 = employee1.get();
        employeeRepository.delete(employee2);

    }



}
