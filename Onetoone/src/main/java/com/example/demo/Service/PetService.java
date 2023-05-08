package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.PetDetailes;
import com.example.demo.Repository.PetMappingRepository;
import com.example.demo.Repository.petRepo;

@Service
public class PetService {
	@Autowired
	petRepo ss_repo;
	@Autowired
	PetMappingRepository ss_Mapping;
	public String addSS(PetDetailes ss_model)
	{
		ss_repo.save(ss_model);
		return "Added!";
	}
	public List<PetDetailes> getSS()
	{
		return ss_repo.findAll();
	}
	public Optional<PetDetailes> getSSById(int id)
	{
		return ss_repo.findById(id);
	}
	public String updateSS(PetDetailes ss_model)
	{
		ss_repo.save(ss_model);
		return "Updated!";
	}
	public String deleteByRequestParamId(int sign_no)
	{
		ss_repo.deleteById(sign_no);
		return "Deleted!";
	}
	public String checkLogin(String uname, String pwd){
		PetDetailes user = ss_repo.findByuname(uname);
		if(user == null) {
			return "no user found";
		}
		else {
			if(user.getPwd().equals(pwd)) {
				return"Login Succesfull";
			}
			else 
			{
				return "Login Failed";
			}
		}
	}
	public PetDetailes addUser(PetDetailes game) {
		return ss_repo.save(game);
	}
	public List<PetDetailes> getUser(){
		return ss_repo.findAll();
	}
	
}

