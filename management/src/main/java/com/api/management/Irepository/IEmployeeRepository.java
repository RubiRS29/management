package com.api.management.Irepository;

import com.api.management.Dto.EmployeeDto;

import java.util.List;
import java.util.Optional;

public interface IEmployeeRepository {
    List<EmployeeDto> getAllEmployees();
    Optional<EmployeeDto> getEmployeeById(Long id);
    Optional<EmployeeDto> saveEmployee(EmployeeDto employee);
    void deleteEmployee(Long id);
}
