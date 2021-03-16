package com.crud.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.crud.model.FeeMaster;
import com.crud.model.Parents;
import com.crud.model.Student;
import com.crud.repository.FeeMasterRepository;
import com.crud.repository.StudentRepository;
import com.crud.service.FeeMasterService;
import com.crud.service.StudentService;
import com.crud.controller.FeeController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/fee")
public class FeeController {

	private static final Logger logger = LoggerFactory.getLogger(FeeController.class);
	
	   @Autowired
	   private FeeMasterService service;
	   
	 
	   
	   // get Student
	   @GetMapping("/list")
	   public ResponseEntity<List<FeeMaster>>  getFee()
	   {
		   logger.info("fetch All Records..");
		   List<FeeMaster> list=service.getAllFee();	    
		    	return ResponseEntity.ok(list);		   
	   }
	
	    //
	   @GetMapping("/search/{session}")
	   public ResponseEntity<List<FeeMaster>>  getFeeBySession(@PathVariable("session") String session)
	   {
		   logger.info("fetch All Records..");
		   List<FeeMaster> list=service.getFeeBySession(session);    
		    	return ResponseEntity.ok(list);		   
	   }
	  
	   
	 
	   //
	  
	   @GetMapping("/get/{id}")
	   public ResponseEntity<Optional<FeeMaster>> getFeeById(@PathVariable("id") int id)
	   {
		   Optional<FeeMaster> fee=service.getFeeById(id);
		   
		   return ResponseEntity.ok(fee);
	   }
	   
	   //
	  
	   // save Student
	    
	   @PostMapping("/save")
	   public ResponseEntity<FeeMaster> saveFee(@RequestBody FeeMaster f)
	   {
		   
		   
		   FeeMaster fee=service.saveFee(f);
			
			URI location=ServletUriComponentsBuilder.
			fromCurrentContextPath()
			.path("{/id}")
			.buildAndExpand(fee.getId())
			.toUri();
			
			
			return ResponseEntity.created(location).build();
	   }
	   
	   @DeleteMapping("/delete/{id}")
		  public ResponseEntity<Void> delStudent(@PathVariable("id") int id)
		  {
		    	  service.deleteFeeById(id);
		    	  
			return  ResponseEntity.noContent().build();
		  }
	   
	  @PutMapping("/update/{id}") 
	  public ResponseEntity<?> updateFee(@RequestBody FeeMaster f,@PathVariable("id") int id)
	   {
		  Optional<FeeMaster> fid=service.getFeeById(id);
		  
		        if(fid.isPresent())
		        {
		        	FeeMaster fee=fid.get();	
		        	service.saveFee(fee);
		        	return new ResponseEntity<>(fee,HttpStatus.OK);
		        }
		        	
		        else 
		        {
		        	return new ResponseEntity<>("id not Found"+fid,HttpStatus.NOT_FOUND);
		        }
		        	 
		        
		        
		     
	   }
	  
	   
	   
}
