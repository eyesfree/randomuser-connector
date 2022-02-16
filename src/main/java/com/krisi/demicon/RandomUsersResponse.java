package com.krisi.demicon;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RandomUsersResponse {
	public List<Result> results;
	public Info info;

	@JsonCreator
	public RandomUsersResponse(@JsonProperty("results") List<Result> results, @JsonProperty("info") Info info) {
		this.results = results;
		this.info = info;
	}

	@Override
	public String toString() {
		StringBuilder usersString = new StringBuilder();
		for (Result user : results) {
			usersString.append(user);
			usersString.append("\n");
		}
		return usersString.toString();
	}

}
