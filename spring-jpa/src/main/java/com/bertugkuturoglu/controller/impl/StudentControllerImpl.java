package com.bertugkuturoglu.controller.impl;

import com.bertugkuturoglu.controller.IStudentController;
import com.bertugkuturoglu.entities.Student;
import com.bertugkuturoglu.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl  implements IStudentController {

    @Autowired
    private IStudentService studentService;

    @PostMapping(path = "/save")
    @Override
    public Student saveStudent(@RequestBody Student student) {
        return studentService.SaveStudent(student);
    }

    @GetMapping(path = "/list")
    @Override
    public List<Student> GetAllStudents() {
        return studentService.GetAllStudents();
    }


    @GetMapping(path = "/list/{id}")
    @Override
    public Student getStudentById( @PathVariable(name = "id") Integer id) {
        return studentService.GetStudentById(id);
    }

    @DeleteMapping(path = "/delete/{id}")
    @Override
    public void deleteStudent(@PathVariable(name = "id") Integer id) {
        studentService.deleteStudent(id);
    }
}
