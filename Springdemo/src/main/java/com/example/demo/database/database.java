package com.example.demo.database;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import antlr.collections.List;

@Repository
public interface database extends JpaRepository<Springsample,Integer> {
	
	@Query("Select d.username from Springsample d where id=:id")
	public String getData(int id);
	


}
