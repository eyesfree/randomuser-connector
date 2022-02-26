package com.krisi.demicon;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public final class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private Long id;
	public String gender;
	
	@OneToOne(cascade = {CascadeType.ALL})
	public Name name;
	public String email;
	//public final Location location;

	@JsonIgnore
	public Long getId() {
		return this.id;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		StringBuilder userString = new StringBuilder();
		userString.append("Name: ").append(name.toString()).append(" Gender: ").append(gender);
		return userString.toString();
	}

	public User() {
	}

	@JsonCreator
	public User(@JsonProperty("gender") String gender, @JsonProperty("name") Name name,
			@JsonProperty("email") String email) {
		this.gender = gender;
		this.name = name;
		this.email = email;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(email, user.email) && Objects.equals(gender, user.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, name, gender);
    }

}