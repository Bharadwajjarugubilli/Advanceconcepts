package com.example.demo.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="springsample")
public class Springsample {



		@Id
		@Column(nullable=false,unique=false)
		public int id;
		
	@Column(nullable=false,unique=false)
	public String username;


		
		

	

}
