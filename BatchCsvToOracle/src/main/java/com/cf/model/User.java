package com.cf.model;

public class User {
 
	private int userId;
	private String name;
	private int salary;
	
	public User() {
		
	}
	public User(int userId, String name, int salary) {
		super();
		this.userId = userId;
		this.name = name;
		this.salary = salary;
	}
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", salary=" + salary + "]";
	}

	
	
}
