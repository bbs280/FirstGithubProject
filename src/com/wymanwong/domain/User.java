package com.wymanwong.domain;

public class User extends BaseEntity {

	private static final long serialVersionUID = 3817641597167356205L;

	private Long id;
	private String username;
	private String password;

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
