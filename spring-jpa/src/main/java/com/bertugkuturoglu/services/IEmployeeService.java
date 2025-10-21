package com.bertugkuturoglu.services;

import com.bertugkuturoglu.dto.DtoEmployee;
import com.bertugkuturoglu.entities.Employee;

import java.util.List;

public interface IEmployeeService {


    public List<DtoEmployee> findAllEmployees();
}
