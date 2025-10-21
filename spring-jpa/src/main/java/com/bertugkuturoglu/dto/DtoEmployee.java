package com.bertugkuturoglu.dto;

import com.bertugkuturoglu.entities.Department;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoEmployee {

    private long id;


    private String name;


    private DtoDepartment department;
}

