package com.entiity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_Details")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Student_id")
	private int id;
	@Column(name="Student_name",nullable = false)
	private String name;
	@Column(name="Student_location")
	private String location;
	@Column(name="Student_email")
	private String email;
	@Column(name="Student_number")
	private long number;
	public Student(int id, String name, String location, String email, long number) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.email = email;
		this.number = number;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", location=" + location + ", email=" + email + ", number="
				+ number + "]";
	}
	
	
}
