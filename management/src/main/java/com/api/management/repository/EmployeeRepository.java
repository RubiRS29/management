package com.api.management.repository;

import com.api.management.CRUD.EmployeeCRUDRepository;
import com.api.management.Dto.EmployeeDto;
import com.api.management.Irepository.IEmployeeRepository;
import com.api.management.entity.Employee;
import com.api.management.mapper.EmployeeMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeRepository implements IEmployeeRepository {

    private final EmployeeCRUDRepository repository;
    private final EmployeeMapper mapper;

    public EmployeeRepository(EmployeeCRUDRepository repository, EmployeeMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        return mapper.toEmployeesDto(repository.findAll());
    }

    @Override
    public Optional<EmployeeDto> getEmployeeById(Long id) {
        return repository.findById(id)
                .map(employee -> mapper.toEmployeeDto(employee));
    }

    @Override
    public Optional<EmployeeDto> saveEmployee(EmployeeDto employeeDto) {
        Employee employee = mapper.toEmployee(employeeDto);
        return Optional.of(mapper.toEmployeeDto(repository.save(employee)));
    }

    @Override
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}
