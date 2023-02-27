package com.ocean.ems.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Sagar.Mohanty
 * Feb 27, 2023
 * 10:55:57 AM
 */
@Data
@NoArgsConstructor  
@AllArgsConstructor  
@ToString
@Entity
@Table(name="employees")
public class Employee {
	@Id
	@JsonProperty( "Id" )
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter @Setter long id;
	
	@Column(name = "first_name")
	@JsonProperty( "firstName")
	private @Getter @Setter String firstName;
	
	@Column(name = "last_name")
	@JsonProperty( "lastName")
	private @Getter @Setter String lastName;
	
	@Column(name = "email")
	@JsonProperty( "email")
	private @Getter @Setter String email;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
