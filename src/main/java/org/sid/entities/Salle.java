package org.sid.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data

@ToString
public class Salle {
	public Salle() {
		super();
	}

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private int nombrePlace;

@ManyToOne @JoinColumn(name = "id_cinema")
private Cinema cinema;

public Salle(Long id, String name, int nombrePlace, Cinema cinema, Collection<Place> places,
		Collection<Projection> projections) {
	super();
	this.id = id;
	this.name = name;
	this.nombrePlace = nombrePlace;
	this.cinema = cinema;
	this.places = places;
	this.projections = projections;
}

@OneToMany(mappedBy = "salle")
@JsonIgnore
private Collection<Place> places;

@OneToMany(mappedBy = "salle")
@JsonIgnore
private Collection<Projection> projections;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getNombrePlace() {
	return nombrePlace;
}

public void setNombrePlace(int nombrePlace) {
	this.nombrePlace = nombrePlace;
}

public Cinema getCinema() {
	return cinema;
}

public void setCinema(Cinema cinema) {
	this.cinema = cinema;
}

public Collection<Place> getPlaces() {
	return places;
}

public void setPlaces(Collection<Place> places) {
	this.places = places;
}

public Collection<Projection> getProjections() {
	return projections;
}

public void setProjections(Collection<Projection> projections) {
	this.projections = projections;
}

	
}
