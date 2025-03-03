package com.mkkormaq.ems.service;

import com.mkkormaq.ems.EmsBackendApplication;
import com.mkkormaq.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();
}
