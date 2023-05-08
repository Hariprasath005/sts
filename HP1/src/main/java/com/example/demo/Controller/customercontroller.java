package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.customerser;
import com.example.demo.pojo.pojoclass;
@RestController
@RequestMapping("/cust")
public class customercontroller {
	@Autowired
	customerser cum;
	@PostMapping(" ")
	public String create(@RequestBody pojoclass abc)
	{
		return cum.addCustomer(abc);
	}
	@GetMapping(" ")
	public List<pojoclass> read()
	{
		return cum.getCustomer();
	}
	@GetMapping("/{id}")
	public Optional<pojoclass>readById(@PathVariable int id)
	{
		return cum.getCustomerById(id);
	}
	@PutMapping("/pum")
	public String update(@RequestBody pojoclass abc)
	{
		return cum.updateCustomer(abc);
	}
	
	}


