package com.bertugkuturoglu.controller;

import com.bertugkuturoglu.entities.Student;

import java.util.List;

public interface IStudentController {

    public Student saveStudent(Student student);

    public List<Student> GetAllStudents();

    public Student getStudentById(Integer id);

    public void deleteStudent(Integer id);
}
