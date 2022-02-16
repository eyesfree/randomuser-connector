package com.krisi.demicon;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Name {
	public final String title;
	public final String first;
	public final String last;

	@JsonCreator
	public Name(@JsonProperty("title") String title, @JsonProperty("first") String first,
			@JsonProperty("last") String last) {
		this.title = title;
		this.first = first;
		this.last = last;
	}
}