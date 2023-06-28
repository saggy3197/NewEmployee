package com.isg.hr.employee.NewEmployee.Controller;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.ReflectionUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.isg.hr.employee.NewEmployee.EmpRepo.EmpRepo;
import com.isg.hr.employee.NewEmployee.Entity.Employee;

@RestController


public class EmpController {

    @Autowired EmpRepo emp;

    @GetMapping("/employee/get")
        public ResponseEntity<Object> getAll(){

        java.util.List<Employee> list = emp.findAll();
        return new ResponseEntity<Object>(list,HttpStatus.OK);
    }


    @GetMapping("/employee/{empcode}")
        public ResponseEntity<Object> findEmployee(@PathVariable("empcode")String empcode){
        Optional<Employee> foundEmp =emp.findById(empcode);
        return new ResponseEntity<Object>(foundEmp,HttpStatus.OK);

        }

    @PostMapping("addemployee")
        public  Employee addEmployee(@RequestBody Employee addemp){
            return emp.save(addemp);

        }
        
    @PutMapping("/employee/{empcode}") 
        public ResponseEntity<Object>updateemployeee(@PathVariable String empcode , @RequestBody Employee employee){
            Optional<Employee> foundEmp = emp.findById(empcode);
            if(foundEmp.isPresent()){
                 
                Employee updateEmp = foundEmp.get();
                updateEmp.setOnsiteothercountry(employee.getOnsiteothercountry());
                updateEmp.setOnsiteothercountrydesc(employee.getOnsiteothercountrydesc());
                updateEmp.setProbation(employee.getProbation());
                updateEmp.setStatus(employee.getStatus());
                updateEmp.setRole(employee.getRole());
                updateEmp.setReportingto(employee.getReportingto());
                updateEmp.setDesignationid(employee.getDesignationid());
                updateEmp.setDivision(employee.getDivision());
                updateEmp.setBandid(employee.getBandid());
                updateEmp.setCreatedby(employee.getCreatedby());
                updateEmp.setCreateddate(employee.getCreateddate());
                updateEmp.setModifiedby(employee.getModifiedby());
                updateEmp.setModifieddate(employee.getModifieddate());

                 emp.save(updateEmp);
                return new ResponseEntity<Object>(updateEmp ,HttpStatus.OK);
             }
             else{
                return new ResponseEntity<Object>("Employee does not exits" ,HttpStatus.OK);
             }
            
        }


     @PatchMapping("/employee/patch/{empcode}")
        public ResponseEntity<Object> patchPerson(@PathVariable String empcode, @RequestBody Map<Object,Object> perMap ){
            Employee employee =emp.findById(empcode).get();
            try{
                    perMap.forEach((key, value)->{
                        Field field = ReflectionUtils.findRequiredField(Employee.class,(String) key);
                        field.setAccessible(true);
                        ReflectionUtils.setField(field, employee,value);
                        emp.save(employee);
                        
                    });
                        return new ResponseEntity<Object>("Person data patch change",HttpStatus.OK);
               }
             catch (Exception e){

                return new ResponseEntity<Object>("person data patch changed",HttpStatus.OK);

                }
    
            }       

     @DeleteMapping("/employee/delete/{empcode}")  
        public ResponseEntity<Object> deletEmployee(@PathVariable String empcode)
        {  
            if(emp.findById(empcode).isPresent()){

                emp.deleteById(empcode);
                return new ResponseEntity<Object>("employee deleted.", HttpStatus.OK);
            }
            else

            return new ResponseEntity<Object>("Employee Does not Exist",HttpStatus.OK);


        }
        
    
    }
