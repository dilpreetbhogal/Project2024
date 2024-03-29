package com.example.project24.controller;

import com.example.project24.Entity.Employee;
import com.example.project24.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/home")
   public List<Employee> getAllEmployees(){
      return employeeService.getAllEmployees();
 }

    @PostMapping("/add")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
       employeeService.addEmployee(employee);
        return ResponseEntity.created(null).body(employee);
    }

    @DeleteMapping("/employees/{id}")
    public void removeCourse(@PathVariable long id){

        employeeService.deleteEmployee(id);

    }

}
