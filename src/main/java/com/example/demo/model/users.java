package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class users {

	@Id
	private String uname;
	private int age;
	
	public void setName(String uname) {
		this.uname = uname;
	}
	public String getName() {
		return uname;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	
}
