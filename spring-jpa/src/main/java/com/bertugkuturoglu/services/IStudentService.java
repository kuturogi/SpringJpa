package com.bertugkuturoglu.services;

import com.bertugkuturoglu.entities.Student;

import java.util.List;

public interface IStudentService {

    public Student SaveStudent(Student student);

    public List<Student> GetAllStudents();

    public Student GetStudentById(Integer id);

    public void deleteStudent(Integer id);

    public Student UpdateStudent(Integer id, Student updateStudent);
}
