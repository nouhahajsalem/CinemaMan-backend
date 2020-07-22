package org.sid.dao;

import java.util.List;

import org.sid.entities.Film;
import org.sid.entities.Projection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProjectionRepository  extends JpaRepository<Projection, Long> {
	 @Query(" SELECT  p FROM Projection p WHERE p.salle.name=(:name) ")
	 public List<Projection> getProjectionName(@Param("name") String name);
}
