package com.api.management.CRUD;

import com.api.management.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeCRUDRepository extends JpaRepository<Employee, Long> {

}
