package com.krisi.demicon;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Id {
	public final String name;
	public final String value;

	@JsonCreator
	public Id(@JsonProperty("name") String name, @JsonProperty("value") String value) {
		this.name = name;
		this.value = value;
	}
}