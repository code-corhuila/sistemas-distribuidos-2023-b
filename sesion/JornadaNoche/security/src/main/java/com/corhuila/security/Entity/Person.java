package com.corhuila.security.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="person")
public class Person extends Auditoria{
	
	@Column(name = "name", length = 50, nullable = false)
	private String name;
	
	@Column(name = "lastname", length = 50, nullable = false)
	private String lastname;
	
	@Column(name = "phone", length = 20, nullable = false)
	private String phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}	
}
