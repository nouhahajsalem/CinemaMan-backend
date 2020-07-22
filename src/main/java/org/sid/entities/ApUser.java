package org.sid.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString

public class ApUser {
	
	public ApUser() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActived() {
		return actived;
	}
	public void setActived(boolean actived) {
		this.actived = actived;
	}
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	public ApUser(Long id, String username, String password, boolean actived, Collection<Role> roles) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.actived = actived;
		this.roles = roles;
	}
	@Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @Column(unique = true)
	    private String username;
	    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	    private String password;
	    private boolean actived;
	    @ManyToMany(fetch = FetchType.EAGER)
	    private Collection<Role> roles=new ArrayList<>();
  
}
