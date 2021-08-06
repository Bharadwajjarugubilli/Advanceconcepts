package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.database.Springsample;
import com.example.demo.database.database;

import antlr.collections.List;


@Service
public class sampleService {
	  
	@Autowired
	database Db;
	
	public String details(int id) {
		return Db.getData(id);
		
	}
	
	public void setValues(Springsample sp)
	{
		
		Db.save(sp);
		
		
	}
	
	
		

}
