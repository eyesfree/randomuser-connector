package com.krisi.demicon;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Picture {
	public final String large;
	public final String medium;
	public final String thumbnail;

	@JsonCreator
	public Picture(@JsonProperty("large") String large, @JsonProperty("medium") String medium,
			@JsonProperty("thumbnail") String thumbnail) {
		this.large = large;
		this.medium = medium;
		this.thumbnail = thumbnail;
	}
}