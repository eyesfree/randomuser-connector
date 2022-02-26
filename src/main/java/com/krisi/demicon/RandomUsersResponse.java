package com.krisi.demicon;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RandomUsersResponse {
	public List<User> results;

	public List<User> getResults() {
		return results;
	}

	@JsonCreator
	public RandomUsersResponse(@JsonProperty("results") List<User> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		StringBuilder usersString = new StringBuilder();
		for (User user : results) {
			usersString.append(user);
			usersString.append("\n");
		}
		return usersString.toString();
	}

}
