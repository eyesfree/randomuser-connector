package com.krisi.demicon;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Dob {
	public final String date;
	public final long age;

	@JsonCreator
	public Dob(@JsonProperty("date") String date, @JsonProperty("age") long age) {
		this.date = date;
		this.age = age;
	}
}