package com.bertugkuturoglu.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "first_name" , nullable = false )
    private String firstName;

    @Column(name = "last_name" ,  nullable = false)
    private String lastName;

    @Column(name = "birth_of_date" , nullable = true)
    private Date birthOfDate;

}
