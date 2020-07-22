package org.sid.dao;

import org.sid.entities.Film;
import org.sid.entities.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeanceRepository  extends JpaRepository<Seance, Long> {

}
