package com.krisi.demicon;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Result {
	public final String gender;
	public final Name name;
	public final Location location;
	public final String email;
	public final Login login;
	public final Dob dob;
	public final Registered registered;
	public final String phone;
	public final String cell;
	public final Id id;
	public final Picture picture;
	public final String nat;
	
    @Override
    public String toString() {
    	StringBuilder userString = new StringBuilder();
    	userString.append("Name: ").append(name.first).append(" Gender: ").append(gender);
    	return userString.toString();
    }

	@JsonCreator
	public Result(@JsonProperty("gender") String gender, @JsonProperty("name") Name name,
			@JsonProperty("location") Location location, @JsonProperty("email") String email,
			@JsonProperty("login") Login login, @JsonProperty("dob") Dob dob,
			@JsonProperty("registered") Registered registered, @JsonProperty("phone") String phone,
			@JsonProperty("cell") String cell, @JsonProperty("id") Id id, @JsonProperty("picture") Picture picture,
			@JsonProperty("nat") String nat) {
		this.gender = gender;
		this.name = name;
		this.location = location;
		this.email = email;
		this.login = login;
		this.dob = dob;
		this.registered = registered;
		this.phone = phone;
		this.cell = cell;
		this.id = id;
		this.picture = picture;
		this.nat = nat;
	}
	

}