package com.crud.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.crud.exception.UserNotFoundException;
import com.crud.model.Recipt;
import com.crud.service.ReciptService;

@RestController
@RequestMapping("/recipt")
public class ReciptController {

	
	private static final Logger logger = LoggerFactory.getLogger(ReciptController.class);
	
	    @Autowired
	    private ReciptService service;
	
	    
	    // get All recipt Records..
	    @GetMapping("/list")
	    public ResponseEntity<List<Recipt>> getAllRecipt(){
	    	
	    	List<Recipt> list=service.getAllRecipt();
	    	if(list.size()==0)
	    	{
	    	   throw new UserNotFoundException("Record not Found");
	    	}
	    	 
	    	else
	    	{
	    		service.getAllRecipt();
	    	}
	       return ResponseEntity.ok(list);
	    }
	    
	    // save Recipt
	    @PostMapping("/save")
	    public ResponseEntity<Recipt> saveRecipt(@RequestBody Recipt recipt)
	    {
	    	Recipt r=service.addRecipt(recipt);
	    	
	    	URI location=ServletUriComponentsBuilder
	    			.fromCurrentContextPath()
	    			.path("{/id}")
	    			.buildAndExpand(r.getId()).toUri();
	    	return ResponseEntity.created(location).build();	    	
	    }
	    
	    // Get Recipt By Id
	    @GetMapping("get/{id}")
	    public ResponseEntity<Optional<Recipt>> getReciptById(@PathVariable("id") int id)    
	    {
	    	Optional<Recipt> r=service.getReciptById(id);
	    	if(!r.isPresent())
	    		throw new UserNotFoundException("Not Found"+r);
	    	else
	    	   return ResponseEntity.ok(r);
	    	
	    }
	    
	   // Delete Recipt By Id
	    @DeleteMapping("/delete/{id}")
	    public ResponseEntity<Void> deleteReciptById(@PathVariable("id") int id)
	    {
	    	Optional<Recipt> r=service.getReciptById(id);
	    	if(!r.isPresent())
	    		throw new UserNotFoundException("Not Found"+r);
	    	else
	    		service.deleteReciptById(id);
	    	return ResponseEntity.noContent().build();
	    }	  
	    
	    // Update Data
	    @PutMapping("/update/{id}")
	    public ResponseEntity<Recipt> updateReciptById(@RequestBody Recipt r,@PathVariable int id)
	    {
	    	Optional<Recipt> rid=service.getReciptById(id);
	    	if(!rid.isPresent())
	    	{
	    		throw new UserNotFoundException("Not Found"+r);
	    	}
	    		
	    	else {
	    		Recipt recipt=rid.get();
	    		
	    		return ResponseEntity.ok(service.addRecipt(recipt));
	    	}
	    		
	    }
	    
}
