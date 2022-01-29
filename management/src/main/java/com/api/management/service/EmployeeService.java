package com.api.management.service;

import com.api.management.Dto.EmployeeDto;
import com.api.management.Irepository.IEmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final IEmployeeRepository repository;

    public EmployeeService(IEmployeeRepository repository) {
        this.repository = repository;
    }

    public List<EmployeeDto> getAllEmployees() {
        return repository.getAllEmployees();
    }

    public EmployeeDto getEmployeeBy(Long id){
        return repository.getEmployeeById(id).orElse(null);
    }

    public EmployeeDto saveEmployee(EmployeeDto employee){
        return repository.saveEmployee(employee).orElse(null);
    }

    public void deleteEmployee(Long id){
        repository.deleteEmployee(id);
    }

}
