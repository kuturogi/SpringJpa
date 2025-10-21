package com.bertugkuturoglu.services.impl;

import com.bertugkuturoglu.dto.DtoDepartment;
import com.bertugkuturoglu.dto.DtoEmployee;
import com.bertugkuturoglu.entities.Employee;
import com.bertugkuturoglu.repository.EmployeeRepository;
import com.bertugkuturoglu.services.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<DtoEmployee> findAllEmployees() {

        List<DtoEmployee> dtoEmployeeList = new ArrayList<>();
        List<Employee> employeeList =employeeRepository.findAll();
        if (employeeList!= null && !employeeList.isEmpty()) {
            for (Employee employee : employeeList) {
                DtoEmployee dtoEmployee = new DtoEmployee();
                BeanUtils.copyProperties(employee, dtoEmployee);

                dtoEmployee.setDepartment(new DtoDepartment(employee.getDepartment().getId(),employee.getDepartment().getDepartmentName()));
                dtoEmployeeList.add(dtoEmployee);
            }
        }
        return dtoEmployeeList;
    }
}
