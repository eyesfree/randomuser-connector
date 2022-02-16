package com.krisi.demicon;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class RandomUser {
    public String gender;
    public Name name;
    public Location location;
    public String email;
    public Login login;

    public RandomUser() {}
    
    public RandomUser(Name name) {
    	this.name = name;
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

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public RandomUser(String gender, Name name, Location location, String email, Login login){
        this.gender = gender;
        this.name = name;
        this.location = location;
        this.email = email;
        this.login = login;
    }
    
    @Override
    public String toString() {
    	StringBuilder userString = new StringBuilder();
    	userString.append("Name: ").append(name).append(" Gender: ").append(gender);
    	return userString.toString();
    }

    public static final class Name {
        public final String title;
        public final String first;
        public final String last;

        public Name(String title, String first, String last){
            this.title = title;
            this.first = first;
            this.last = last;
        }
    }

    public static final class Location {
        public final String street;
        public final String city;
        public final String state;
        public final String postcode;
        public final Coordinates coordinates;
        public final Timezone timezone;

        public Location(String street, String city, String state, String postcode, Coordinates coordinates, Timezone timezone){
            this.street = street;
            this.city = city;
            this.state = state;
            this.postcode = postcode;
            this.coordinates = coordinates;
            this.timezone = timezone;
        }

        public static final class Coordinates {
            public final String latitude;
            public final String longitude;
    
            public Coordinates(String latitude, String longitude){
                this.latitude = latitude;
                this.longitude = longitude;
            }
        }

        public static final class Timezone {
            public final String offset;
            public final String description;
    
            public Timezone(String offset, String description){
                this.offset = offset;
                this.description = description;
            }
        }
    }

    public static final class Login {
        public final String uuid;
        public final String username;
        public final String password;
        public final String salt;
        public final String md5;
        public final String sha1;
        public final String sha256;

        public Login(String uuid, String username, String password, String salt, String md5, String sha1, String sha256){
            this.uuid = uuid;
            this.username = username;
            this.password = password;
            this.salt = salt;
            this.md5 = md5;
            this.sha1 = sha1;
            this.sha256 = sha256;
        }
    }
}