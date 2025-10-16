package com.bertugkuturoglu.controller.impl;

import com.bertugkuturoglu.controller.IStudentController;
import com.bertugkuturoglu.dto.DtoStudent;
import com.bertugkuturoglu.dto.DtoStudentIU;
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
    public DtoStudent saveStudent(@RequestBody DtoStudentIU dtoStudentIU) {
        return studentService.SaveStudent(dtoStudentIU);
    }

    @GetMapping(path = "/list")
    @Override
    public List<DtoStudent> GetAllStudents() {
        return studentService.GetAllStudents();
    }


    @GetMapping(path = "/list/{id}")
    @Override
    public DtoStudent getStudentById( @PathVariable(name = "id") Integer id) {
        return studentService.GetStudentById(id);
    }

    @DeleteMapping(path = "/delete/{id}")
    @Override
    public void deleteStudent(@PathVariable(name = "id") Integer id) {
        studentService.deleteStudent(id);
    }

    @PutMapping(path = "/update/{id}")
    @Override
    public Student updateStudent(@PathVariable(name = "id") Integer id, @RequestBody Student updateStudent) {
        return studentService.UpdateStudent(id, updateStudent);
    }
}
