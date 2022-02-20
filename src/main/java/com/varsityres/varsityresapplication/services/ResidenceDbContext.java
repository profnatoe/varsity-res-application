package com.varsityres.varsityresapplication.services;

import com.varsityres.varsityresapplication.data.Residence;
import com.varsityres.varsityresapplication.data.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResidenceDbContext extends JpaRepository<Residence, Long> {

}

