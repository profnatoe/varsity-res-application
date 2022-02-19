package com.varsityres.varsityresapplication.services;

import com.varsityres.varsityresapplication.data.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationDbContext extends JpaRepository<Student, Long> {

}
