package org.sid.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ville {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private double longitude,latitude,altitude;
@OneToMany(mappedBy = "ville")
@JsonIgnore
private Collection<Cinema> cinemas;
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
public double getLongitude() {
	return longitude;
}
public void setLongitude(double longitude) {
	this.longitude = longitude;
}
public double getLatitude() {
	return latitude;
}
public void setLatitude(double latitude) {
	this.latitude = latitude;
}
public double getAltitude() {
	return altitude;
}
public void setAltitude(double altitude) {
	this.altitude = altitude;
}
public Collection<Cinema> getCinemas() {
	return cinemas;
}
public void setCinemas(Collection<Cinema> cinemas) {
	this.cinemas = cinemas;
}
	
}
