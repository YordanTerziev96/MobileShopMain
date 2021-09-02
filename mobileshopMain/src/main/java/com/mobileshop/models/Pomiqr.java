package com.mobileshop.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pomiqr")
public class Pomiqr extends BaseEntity{

	@Column(name = "username", nullable = false)
	private String username;

	@Column(name = "password", nullable = false)
	private String password;

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
