package com.yesildeniz;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Adresler {
		
	@Column(name="ULKE",nullable = true)
	private String country;
	
	@Column(name="SEHIR")
	private String city;
	
	@Column(name="MAHALLE")
	private String street;
	
	
	
	public Adresler(){}

	public Adresler(String country, String city, String street) {
		super();
		this.country = country;
		this.city = city;
		this.street = street;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	
	
	
}
