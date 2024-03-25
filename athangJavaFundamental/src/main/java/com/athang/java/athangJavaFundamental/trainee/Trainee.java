package com.athang.java.athangJavaFundamental.trainee;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "trainee_tb")
public class Trainee {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	private String qualification;
	private Date createdDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	} 
	
	
}
