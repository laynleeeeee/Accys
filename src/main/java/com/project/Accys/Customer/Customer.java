package com.project.Accys.Customer;

import java.time.LocalDate;

public class Customer {
	private Long id;
	private String name;
	private Integer age;
	private String email;
	private LocalDate dob;

	public Customer() {
		super();
	}

	public Customer(Long id, String name, Integer age, String email, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.dob = dob;
	}

	public Customer(String name, Integer age, String email, LocalDate dob) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.dob = dob;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", dob=" + dob + "]";
	}
}
