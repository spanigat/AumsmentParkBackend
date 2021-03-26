package com.example.demo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "park")
public class Park {

	private long id;
	private String name;
	private int age;
	private String typeOfRide;
	private String rideName;
	private int noOfRide;
	private long amount;
	
	public Park() {
		
	}
	
	
	
	public Park(long id, String name, int age, String typeOfRide, String rideName, int noOfRide, long amount) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.typeOfRide = typeOfRide;
		this.rideName = rideName;
		this.noOfRide = noOfRide;
		this.amount = amount;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getTypeOfRide() {
		return typeOfRide;
	}



	public void setTypeOfRide(String typeOfRide) {
		this.typeOfRide = typeOfRide;
	}



	public String getRideName() {
		return rideName;
	}



	public void setRideName(String rideName) {
		this.rideName = rideName;
	}



	public int getNoOfRide() {
		return noOfRide;
	}



	public void setNoOfRide(int noOfRide) {
		this.noOfRide = noOfRide;
	}



	public long getAmount() {
		return amount;
	}



	public void setAmount(long amount) {
		this.amount = amount;
	}



	
}
