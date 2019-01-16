package cn.itcast.domain;

import java.io.Serializable;

public class Users implements Serializable {
	private Integer id;
	private String username;
	private String password;
	private String telephone;
	
	private Integer state;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Users{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", telephone='" + telephone + '\'' +
				", state=" + state +
				'}';
	}
}
