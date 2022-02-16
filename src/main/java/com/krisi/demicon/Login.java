package com.krisi.demicon;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Login {
	public final String uuid;
	public final String username;
	public final String password;
	public final String salt;
	public final String md5;
	public final String sha1;
	public final String sha256;

	@JsonCreator
	public Login(@JsonProperty("uuid") String uuid, @JsonProperty("username") String username,
			@JsonProperty("password") String password, @JsonProperty("salt") String salt,
			@JsonProperty("md5") String md5, @JsonProperty("sha1") String sha1,
			@JsonProperty("sha256") String sha256) {
		this.uuid = uuid;
		this.username = username;
		this.password = password;
		this.salt = salt;
		this.md5 = md5;
		this.sha1 = sha1;
		this.sha256 = sha256;
	}
}