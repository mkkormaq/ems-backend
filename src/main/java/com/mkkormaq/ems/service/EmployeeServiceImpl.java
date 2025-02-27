package com.mkkormaq.ems.service;

import com.mkkormaq.ems.dto.EmployeeDto;
import com.mkkormaq.ems.entity.Employee;
import com.mkkormaq.ems.mapper.EmployeeMapper;
import com.mkkormaq.ems.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);


        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
