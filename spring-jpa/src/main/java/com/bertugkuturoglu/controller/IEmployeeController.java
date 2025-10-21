package com.bertugkuturoglu.controller;

import com.bertugkuturoglu.dto.DtoEmployee;

import java.util.List;

public interface IEmployeeController {

    public List<DtoEmployee> findAllEmployees();
}
