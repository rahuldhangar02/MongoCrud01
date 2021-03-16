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
import com.crud.repository.StudentRepository;
import com.crud.service.StudentService;
import com.crud.controller.StudentController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/student")
public class StudentController {

	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	   @Autowired
	   private StudentService studServcie;
	   
	  @Autowired
	  private StudentRepository repo;
	
	  
	  
	  
	   
	   // get Student
	   @GetMapping("/list")
	   public ResponseEntity<List<Student>>  getStudent()
	   {
		   logger.info("fetch All Records..");
		   List<Student> list=studServcie.getAllStudent();
		    
		    	return ResponseEntity.ok(list);
		   
		   
	   }
	   // find student by classname and gender
	   @GetMapping("/search1/{classname}/{gender}")
	   public ResponseEntity<List<Student>> getByClassNameAndGender(@PathVariable("classname") String classname,@PathVariable("gender") String gender)
	   {
		  List<Student> list=studServcie.getByClassNameAndGender(classname,gender); 
		  return ResponseEntity.ok(list);
		  
	   }
	   
	   
	   
	  //
	   @GetMapping("/firstname/{firstname}")
	   public ResponseEntity<List<Student>>  getAllByFirstName(@PathVariable("firstname") String firstname)
	   {
		   logger.info("fetch All Records..");
		   List<Student> list=studServcie.getByName(firstname);
		    
		    	return ResponseEntity.ok(list);
		   
		   
	   }
	   // search by class name and session
	   @GetMapping("/search/{classname}/{contact}")
	   public ResponseEntity<List<Student>>  getByclassNameAndContact(@PathVariable("classname") String classname,@PathVariable("contact") long contact)
	   {
		   logger.info("fetch All Records..");
		   List<Student> list=studServcie.getByClassNameAndContact(classname, contact);
		    
		    	return ResponseEntity.ok(list);
		   
		   
	   }
	   // get Student by id
	   @GetMapping("/get/{id}")
	   public ResponseEntity<Optional<Student>> getStudentById(@PathVariable("id") int id)
	   {
		   Optional<Student> student=studServcie.getStudentById(id);
		   
		   return ResponseEntity.ok(student);
	   }
	   
	   // save Student
	    
	   @PostMapping("/save")
	   public ResponseEntity<Student> saveStudent(@RequestBody Student s)
	   {
		   
		   
		   Student student=studServcie.saveStudent(s);
			
			URI location=ServletUriComponentsBuilder.
			fromCurrentContextPath()
			.path("{/id}")
			.buildAndExpand(student.getId())
			.toUri();
			
			
			return ResponseEntity.created(location).build();
	   }
	   
	   @DeleteMapping("/delete/{id}")
		  public ResponseEntity<Void> delStudent(@PathVariable("id") int id)
		  {
		    	  studServcie.deleteStudentById(id);
		    	  
			return  ResponseEntity.noContent().build();
		  }
	   
	  @PutMapping("/update/{id}") 
	  public ResponseEntity<?> updateStudent(@RequestBody Student s,@PathVariable("id") int id,Parents p)
	   {
		  Optional<Student> sid=studServcie.getStudentById(id);
		  
		        if(sid.isPresent())
		        {
		        	Student stud=sid.get();	
		        	studServcie.saveStudent(stud);
		        	return new ResponseEntity<>(stud,HttpStatus.OK);
		        }
		        	
		        else 
		        {
		        	return new ResponseEntity<>("id not Found"+sid,HttpStatus.NOT_FOUND);
		        }
		        	 
		        
		        
		     
	   }
	  
	   
	   
}
