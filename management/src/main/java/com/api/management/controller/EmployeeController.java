package com.api.management.controller;

import com.api.management.Dto.EmployeeDto;
import com.api.management.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/api/employees")
    public List<EmployeeDto> getAllEmployees(){
        return service.getAllEmployees();
    }

    @GetMapping("/api/employee/{id}")
    public EmployeeDto getEmployee(@PathVariable String id){
        return service.getEmployeeBy(Long.parseLong(id));
    }

    @PostMapping("/api/employee/save")
    public EmployeeDto saveEmployee(@RequestBody EmployeeDto employee){
        return service.saveEmployee(employee);
    }

    @DeleteMapping("/api/employee/delete/{id}")
    public void deleteEmployee(@PathVariable String id){
        service.deleteEmployee(Long.parseLong(id));
    }
}
