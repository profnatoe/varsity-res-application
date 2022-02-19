package com.varsityres.varsityresapplication.controllers;

import com.varsityres.varsityresapplication.data.Student;
import com.varsityres.varsityresapplication.services.ApplicationDbContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/Student/")
public class StudentController {

   private final ApplicationDbContext context;


    @Autowired
    public StudentController(ApplicationDbContext context) {
        this.context = context;
    }

    @GetMapping
    public List<Student> GetAllStudent()
    {
        return context.findAll();
    }



}
