package com.krisi.demicon;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public final class Name {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private long id;
	
	@JsonIgnore
	public long getId() {
		return id;
	}

	@JsonIgnore
	public void setId(long id) {
		this.id = id;
	}

	public final String title;
	public final String first;
	public final String last;
	
	@OneToOne(mappedBy = "name")
    private User user;

	@JsonCreator
	public Name(@JsonProperty("title") String title, @JsonProperty("first") String first,
			@JsonProperty("last") String last) {
		this.title = title;
		this.first = first;
		this.last = last;
	}
	
    @Override
    public String toString() {
    	return this.title + " " + this.first + " " + this.last;
    }
}