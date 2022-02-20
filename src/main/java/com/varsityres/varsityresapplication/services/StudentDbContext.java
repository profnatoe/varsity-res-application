package com.varsityres.varsityresapplication.services;

import com.varsityres.varsityresapplication.data.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDbContext extends JpaRepository<Student, Long> {

}
