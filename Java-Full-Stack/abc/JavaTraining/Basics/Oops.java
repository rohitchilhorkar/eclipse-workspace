package Basics;

import java.time.LocalDate;

public class Oops{
	private String name;
	private int id;
	private int age;
	private double salary;
	private LocalDate dateOfJoining;

	public Oops(String name, int id, int age, double salary, LocalDate dateOfJoining) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}	
}