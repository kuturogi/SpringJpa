package com.bertugkuturoglu.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU {

    @NotEmpty(message = "FirstName alani bos birakilamaz!")
    @Min(value = 3)
    @Max(value = 10)
    private String firstName;

    @Size(min = 2, max = 30)
    private String lastName;

    private Date birthOfDate;

    @Email(message = "email formatinda bir adres giriniz!")
    private String email;

    @Size(min = 11, max = 11 , message = "tckn alani 11 karakter olmali")
    @NotEmpty(message = "tckn alani bos gecilemez")
    private String tckn;


}
