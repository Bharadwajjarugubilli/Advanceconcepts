package com.example.demo.Controller;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.sampleService;
import com.example.demo.database.Springsample;

import antlr.collections.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@RestController 
public class LoginController {
	
	@Autowired
	sampleService ser;
	
	@GetMapping(value="login/{id}")
	public String Login(@PathVariable int id) {
		
		return  ser.details(id)	; 
	}
	@PostMapping(value="/register")
	public void postDetails(@RequestBody Springsample sp ) {
		
	ser.setValues(sp);
	}
	
	
	
	

}
