package org.sid.dao;

import java.util.List;

import org.sid.entities.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CinemaRepository extends JpaRepository<Cinema, Long>{
	 @Query(" SELECT  i.name FROM Cinema i WHERE i.ville.name=(:name) ")
	 public List<Object> getCinemaName(@Param("name") String name);
	 
	 @Query(" SELECT  i.name FROM Cinema i ")
	 public List<String> getAllCinemaName();
	 
	 @Query(" SELECT  i.id FROM Cinema i WHERE i.name=(:name) ")
	 public Long getCinemaByName(@Param("name") String name);
	 
}
