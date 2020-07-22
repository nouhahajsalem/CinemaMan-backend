package org.sid.RestService;

import java.util.List;

import org.sid.entities.Cinema;
import org.sid.entities.Projection;
import org.sid.entities.Salle;
import org.sid.entities.Ville;
import org.sid.service.ICinemaInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class cinemaRestService {
	@Autowired	
	private ICinemaInitService Icinema; 
	
	@RequestMapping(value="/cities",method=RequestMethod.GET)
	public List<Object> findVilles(){
		
		return Icinema.getVilles();
	}
	
	@RequestMapping(value="/cinemas/{name}",method=RequestMethod.GET)
	public List<Object> findCinemas(@PathVariable String name){
		return Icinema.getCinemaName(name);
	}
	@RequestMapping(value="/allSalles",method=RequestMethod.GET)
	public List<Object> findCinemas(){
		return Icinema.getAllSalle();
	}

	@RequestMapping(value="/salles/{name}",method=RequestMethod.GET)
	public List<Object> findSalles(@PathVariable String name){
		return Icinema.getSalleName(name);
	}
	
	@RequestMapping(value="/projection/{salle}",method=RequestMethod.GET)
	public List<Projection> findProjections(@PathVariable String salle){
		return Icinema.getProjectionName(salle);
	}

	@RequestMapping(value="/saveCinema",method=RequestMethod.POST)
	public Cinema saveStudent(@RequestBody Cinema s) {
		System.out.println("s="+s);
		return Icinema.saveCinema(s);
	}
	@RequestMapping(value="/villeNom/{nom}",method=RequestMethod.GET)
	public Long findCityByName(@PathVariable String nom){
		return Icinema.getVilleByName(nom);
	}
	
	@RequestMapping(value="/allCinema/",method=RequestMethod.GET)
	public List<String> findCityByName(){
		return Icinema.getAllCinema();
		
	}
	@RequestMapping(value="/cinemaNom/{nom}",method=RequestMethod.GET)
	public Long findCinemaByName(@PathVariable String nom){
		return Icinema.getCinemaByName(nom);
	}
	
	@RequestMapping(value="/saveSalle",method=RequestMethod.POST)
	public Salle saveSalle(@RequestBody Salle s) {
		System.out.println("s="+s);
		return Icinema.saveSalle(s);
	}
	@RequestMapping(value="/cinemas",method=RequestMethod.GET)
	public List<Cinema> findCinem(){
		return Icinema.getAllCinemas();
	}
	@RequestMapping(value="/deleteCinema/{id}",method=RequestMethod.DELETE)
	public void deleteCinema(@PathVariable Long id){
		System.out.println("delet"+id);
		Icinema.deleteCinema(id);
	}
	@RequestMapping(value="/deleteSalle/{id}",method=RequestMethod.DELETE)
	public void deleteSalle(@PathVariable Long id){
		System.out.println("delet"+id);
		Icinema.deleteSalle(id);
	}
	
	
}
