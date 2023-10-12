package com.Numetry.SpringDocker.Repository;

import com.Numetry.SpringDocker.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    Employee save(Employee employee);
}
