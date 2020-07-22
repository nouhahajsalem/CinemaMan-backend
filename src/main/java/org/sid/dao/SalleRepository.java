package org.sid.dao;

import java.util.List;

import org.sid.entities.Film;
import org.sid.entities.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SalleRepository  extends JpaRepository<Salle, Long> {
	 @Query(" SELECT  i FROM Salle i WHERE i.cinema.name=(:name) ")
	 public List<Object> getSalleName(@Param("name") String name);
	 
	 @Query(" SELECT  i FROM Salle i  ")
	 public List<Object> getAllSalle();
}
