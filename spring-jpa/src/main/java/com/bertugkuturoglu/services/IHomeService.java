package com.bertugkuturoglu.services;

import com.bertugkuturoglu.dto.DtoHome;

import java.util.List;

public interface IHomeService {

    public DtoHome findHomeById(Long id);
}
