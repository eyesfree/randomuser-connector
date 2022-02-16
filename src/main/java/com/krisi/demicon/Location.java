package com.krisi.demicon;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Location {
	public final Location.Street street;
	public final String city;
	public final String state;
	public final String country;
	public final String postcode;
	public final Location.Coordinates coordinates;
	public final Location.Timezone timezone;

	@JsonCreator
	public Location(@JsonProperty("street") Location.Street street, @JsonProperty("city") String city,
			@JsonProperty("state") String state, @JsonProperty("country") String country,
			@JsonProperty("postcode") String postcode, @JsonProperty("coordinates") Location.Coordinates coordinates,
			@JsonProperty("timezone") Location.Timezone timezone) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.postcode = postcode;
		this.coordinates = coordinates;
		this.timezone = timezone;
	}

	public static final class Street {
		public final long number;
		public final String name;

		@JsonCreator
		public Street(@JsonProperty("number") long number, @JsonProperty("name") String name) {
			this.number = number;
			this.name = name;
		}
	}

	public static final class Coordinates {
		public final String latitude;
		public final String longitude;

		@JsonCreator
		public Coordinates(@JsonProperty("latitude") String latitude,
				@JsonProperty("longitude") String longitude) {
			this.latitude = latitude;
			this.longitude = longitude;
		}
	}

	public static final class Timezone {
		public final String offset;
		public final String description;

		@JsonCreator
		public Timezone(@JsonProperty("offset") String offset,
				@JsonProperty("description") String description) {
			this.offset = offset;
			this.description = description;
		}
	}
}