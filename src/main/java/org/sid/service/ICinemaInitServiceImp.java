package org.sid.service;

import java.util.List;

import org.sid.dao.CinemaRepository;
import org.sid.dao.ProjectionRepository;
import org.sid.dao.SalleRepository;
import org.sid.dao.VilleRepository;
import org.sid.entities.Cinema;
import org.sid.entities.Projection;
import org.sid.entities.Salle;
import org.sid.entities.Ville;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@Service
public class ICinemaInitServiceImp  implements  ICinemaInitService {
	@Autowired
	private VilleRepository villeRepository;
	@Autowired
	private CinemaRepository cinemaRepository;
	@Autowired
	private SalleRepository salleRepository;
	@Autowired
	private ProjectionRepository projectionRepository;
	
	@Override
	public List<Object> getVilles() {
	return this.villeRepository.getVilleName();
	}

	@Override
	public List<Object> getCinemaName(String name) {
		return this.cinemaRepository.getCinemaName( name) ;
	}

	@Override
	public List<Object> getSalleName(String name) {
		return salleRepository.getSalleName(name);
	}

	@Override
	public List<Projection> getProjectionName(String name) {
		return  projectionRepository.getProjectionName(name);
	}

	@Override
	public Cinema saveCinema(Cinema s) {
		System.out.println(s.toString());
		return cinemaRepository.save(s);
	}

	@Override
	public Long getVilleByName(String name) {
		// TODO Auto-generated method stub
		return villeRepository.getVilleId(name);
	}

	@Override
	public List<Object> getAllSalle() {
		// TODO Auto-generated method stub
		return salleRepository.getAllSalle();
	}

	@Override
	public List<String> getAllCinema() {
		// TODO Auto-generated method stub
		return cinemaRepository.getAllCinemaName();
	}

	@Override
	public Long getCinemaByName(String name) {
		
		return cinemaRepository.getCinemaByName(name);
	}

	@Override
	public Salle saveSalle(Salle salle) {
		// TODO Auto-generated method stub
		return salleRepository.save(salle);
	}

	@Override
	public List<Cinema> getAllCinemas() {
	
		return cinemaRepository.findAll();
	}

	@Override
	public void deleteCinema(Long c) {
		// TODO Auto-generated method stub
		 cinemaRepository.deleteById(c);;
	}

	@Override
	public void deleteSalle(Long c) {
		salleRepository.deleteById(c);
		
	}
	
}
