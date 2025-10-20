package com.bertugkuturoglu.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DtoHome {

    private long id;

    private BigDecimal price;

    private List<DtoRoom> room =new ArrayList<>();
}
