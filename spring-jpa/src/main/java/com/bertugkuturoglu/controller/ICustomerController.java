package com.bertugkuturoglu.controller;

import com.bertugkuturoglu.dto.DtoCustomer;

public interface ICustomerController {

    public DtoCustomer findCustomerById(Long id);
}
