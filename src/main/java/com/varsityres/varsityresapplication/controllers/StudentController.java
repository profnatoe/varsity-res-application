package com.varsityres.varsityresapplication.controllers;
import com.varsityres.varsityresapplication.data.Student;
import com.varsityres.varsityresapplication.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/Student")
public class StudentController {

    private final StudentService context;

    @Autowired
    public StudentController(StudentService context) {
        this.context = context;
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudent()
    {
        return new ResponseEntity<List<Student>>( context.RetrieveAllStudents(),HttpStatus.OK);
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Student> getStudent(@PathVariable("id") Long id)
    {
        var student = context.getStudent(id);
        if(student == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Student>(student, HttpStatus.OK);
    }



}
