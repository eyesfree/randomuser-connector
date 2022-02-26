package com.krisi.demicon;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public final class Location {
	public String country;
	
	@ManyToOne
	public User user;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private long id;

	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}

	@JsonCreator
	public Location(@JsonProperty("country") String country) {

		this.country = country;
	}
	
	@JsonCreator
	public Location() {
	}

	public static final class Street {
		public final long number;
		public final String name;

		@JsonCreator
		public Street(@JsonProperty("number") long number, @JsonProperty("name") String name) {
			this.number = number;
			this.name = name;
		}
	}
}