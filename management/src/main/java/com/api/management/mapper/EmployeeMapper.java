package com.api.management.mapper;

import com.api.management.Dto.EmployeeDto;
import com.api.management.entity.Employee;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    @Mapping(target="id", source="id")
    @Mapping(target="firstName", source="firstName")
    @Mapping(target="email", source="email")
    @Mapping(target="phone", source="phone")
    @Mapping(target="address", source="address")
    @Mapping(target="salary", source="salary")
    EmployeeDto toEmployeeDto(Employee employee);

    List<EmployeeDto> toEmployeesDto(List<Employee> employee);

    @InheritInverseConfiguration
    Employee toEmployee(EmployeeDto EmployeeDto);

}
