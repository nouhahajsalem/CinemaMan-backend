package org.sid.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Projection {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id ;
private Date dateProjection;
private double prix;
@ManyToOne
private Salle salle;

public Projection(Long id, Date dateProjection, double prix, Salle salle, Film film, Collection<Ticket> tickets,
		Seance seance) {
	super();
	this.id = id;
	this.dateProjection = dateProjection;
	this.prix = prix;
	this.salle = salle;
	this.film = film;
	this.tickets = tickets;
	this.seance = seance;
}
public Projection() {
	super();
}
@ManyToOne
private Film  film;
@OneToMany(mappedBy = "projection")
@JsonIgnore
private Collection<Ticket> tickets;
@ManyToOne
private Seance seance;


}
