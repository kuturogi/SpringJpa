package com.bertugkuturoglu.controller;

import com.bertugkuturoglu.dto.DtoStudent;
import com.bertugkuturoglu.dto.DtoStudentIU;
import com.bertugkuturoglu.entities.Student;

import java.util.List;

public interface IStudentController {

    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);

    public List<Student> GetAllStudents();

    public Student getStudentById(Integer id);

    public void deleteStudent(Integer id);

    public Student updateStudent(Integer id, Student updateStudent);
}
