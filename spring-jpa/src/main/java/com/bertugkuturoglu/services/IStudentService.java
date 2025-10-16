package com.bertugkuturoglu.services;

import com.bertugkuturoglu.dto.DtoStudent;
import com.bertugkuturoglu.dto.DtoStudentIU;
import com.bertugkuturoglu.entities.Student;

import java.util.List;

public interface IStudentService {

    public DtoStudent SaveStudent(DtoStudentIU student);

    public List<DtoStudent> GetAllStudents();

    public DtoStudent GetStudentById(Integer id);

    public void deleteStudent(Integer id);

    public DtoStudent UpdateStudent(Integer id, DtoStudentIU dtoStudentIU);
}
