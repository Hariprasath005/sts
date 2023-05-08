package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.customerRep;
import com.example.demo.pojo.pojoclass;

@Service
	public class customerser {
		@Autowired
		customerRep repository;
		public String addCustomer(pojoclass cus)
		{
			repository.save(cus);
			return "Added";
		}
		public List<pojoclass> getCustomer()
		{
			return repository.findAll();
		}
		public Optional<pojoclass> getCustomerById(int id)
		{
			return repository.findById(id);
		}
		public String updateCustomer(pojoclass abc)
		{
			repository.save(abc);
			return "Updated successfully";
		}
		

	}
	


