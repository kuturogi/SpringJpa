package com.bertugkuturoglu.services.impl;

import com.bertugkuturoglu.entities.Student;
import com.bertugkuturoglu.repository.StudentRepository;
import com.bertugkuturoglu.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student SaveStudent(Student student) {
        return studentRepository.save(student);

    }

    @Override
    public List<Student> GetAllStudents() {
       List<Student> studentList= studentRepository.findAll();
       return studentList;
    }

    @Override
    public Student GetStudentById(Integer id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student UpdateStudent(Integer id, Student updateStudent) {
         Student dbstudent = studentRepository.findById(id).get();
         if (dbstudent !=null){
             dbstudent.setFirstName(updateStudent.getFirstName());
             dbstudent.setLastName(updateStudent.getLastName());
             dbstudent.setBirthOfDate(updateStudent.getBirthOfDate());

             return studentRepository.save(dbstudent);
         }
       return null;
    }
}
