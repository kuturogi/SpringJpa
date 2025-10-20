package com.bertugkuturoglu.services;

import com.bertugkuturoglu.dto.DtoCustomer;

public interface ICustomerService {

    public DtoCustomer findCustomerById(Long id);
}
