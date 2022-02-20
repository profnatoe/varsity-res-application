package com.varsityres.varsityresapplication.services;

import com.varsityres.varsityresapplication.data.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentDbContext context;

    @Autowired
    public StudentService(StudentDbContext context) {
        this.context = context;
    }

    public List<Student> RetrieveAllStudents()
    {
        return context.findAll();
    }

    public Student getStudent(Long id){
        return context.findById(id).get();
    }
}
