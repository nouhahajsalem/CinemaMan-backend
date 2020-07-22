package org.sid.dao;

import java.util.List;

import org.sid.entities.Film;
import org.sid.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VilleRepository   extends JpaRepository<Ville, Long>{
	 @Query(" SELECT  i.name FROM Ville i  ")
	 public List<Object> getVilleName();
	 @Query(" SELECT  i.id FROM Ville i WHERE i.name=(:name)  ")
	 public Long getVilleId(String name);
}
