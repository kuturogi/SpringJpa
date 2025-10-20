package com.bertugkuturoglu.controller;

import com.bertugkuturoglu.dto.DtoHome;

public interface IHomeController {

    public DtoHome findHomeById(Long id);
}
