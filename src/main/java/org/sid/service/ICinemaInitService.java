package org.sid.service;

import java.util.List;

import org.sid.entities.Cinema;
import org.sid.entities.Projection;
import org.sid.entities.Salle;
import org.sid.entities.Ville;

public interface ICinemaInitService {

public List<Object> getVilles();
public List<Object> getCinemaName(String name);
public List<Object> getSalleName(String name);
public List<Object> getAllSalle();
public List<Projection> getProjectionName(String name);
public Cinema saveCinema(Cinema s);
public Long getVilleByName(String name);
public List<String> getAllCinema();
public Long getCinemaByName(String name);
public Salle saveSalle(Salle salle);
public List<Cinema> getAllCinemas();
public void deleteCinema(Long c);
public void deleteSalle(Long c);
}
