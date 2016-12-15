package com.spring.model;



	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	@Entity

	public class Students 
	{
		
	@Id
	@GeneratedValue
	@Column
		private Integer id;
		private String Name;
		private String country;
		private Integer mobile;
	public Students()
	{
		
	}
	public Students(Integer id, String name, String country, Integer mobile)
	{
		this.id = id;
		this.setName(name);
		this.setCountry(country);
	    this.setMobile(mobile); 
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

		

		
	}

