package com.sms.springboot.hospitalservicesh2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HOSPITAL")
public class Hospital {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    
    @Column(name="NAME")
    private String name;
    
    @Column(name="CITY")
	private String city;
	
	@Column(name="RATING")
    private double rating;
    
    public Hospital() {
		  
	  }
	  
	  public Hospital(int id, String name, String city, double rating) {
		  this.id= id;
		  this.name= name;
		  this.city= city;
		  this.rating=rating;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}

}
