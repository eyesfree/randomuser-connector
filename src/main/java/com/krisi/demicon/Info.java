package com.krisi.demicon;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Info {
	public final String seed;
	public final long results;
	public final long page;
	public final String version;

	@JsonCreator
	public Info(@JsonProperty("seed") String seed, @JsonProperty("results") long results,
			@JsonProperty("page") long page, @JsonProperty("version") String version) {
		this.seed = seed;
		this.results = results;
		this.page = page;
		this.version = version;
	}
}