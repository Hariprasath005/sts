package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.PetDetailes;


@Repository
public interface petRepo extends JpaRepository<PetDetailes,Integer>
{
	PetDetailes findByuname(String uname);	
}