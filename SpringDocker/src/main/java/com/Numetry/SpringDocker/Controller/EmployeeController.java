package com.Numetry.SpringDocker.Controller;

import com.Numetry.SpringDocker.Model.Employee;
import com.Numetry.SpringDocker.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping("/findAll")
    public List<Employee> list(){
        return employeeRepository.findAll();
    }
    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
}
