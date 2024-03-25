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
}
