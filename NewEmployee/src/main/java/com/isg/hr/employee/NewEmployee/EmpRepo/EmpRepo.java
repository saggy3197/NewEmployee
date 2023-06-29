package com.isg.hr.employee.NewEmployee.EmpRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isg.hr.employee.NewEmployee.Entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee,String>{
    
}
