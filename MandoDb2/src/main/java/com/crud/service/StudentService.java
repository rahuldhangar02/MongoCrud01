package com.crud.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.crud.model.FeeMaster;
import com.crud.model.Student;
import com.crud.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studRepo;
	
	
    
     
     // get Student by first Nane
	public List<Student> getByName(String firstname)
	{
		
		return studRepo.findByFirstName(firstname);
	}
     
	// find by className and Contact
	public List<Student> getByClassNameAndContact(String className,long contact)
	{
		
		return studRepo.findByClassNameAndMobile(className, contact);
	}
     
 
	/// list student
	
	public List<Student> getAllStudent()
	{
		
		return studRepo.findAll();
	}
	
	// save Student
	
	public Student saveStudent(Student student)
	{
		return studRepo.save(student);
	}
	
	// get Student
	public Optional<Student> getStudentById(int id)
	{
		
		return studRepo.findById(id);
	}
	
	// delete Student by Id
	
	public void deleteStudentById(int id)
	{
		studRepo.deleteById(id);
	}

	public List<Student> getStudentByFirstName(String firstname) {
		
		return studRepo.findByFirstName(firstname);
	}

	public List<Student> getByClassNameAndGender(String classname, String gender) {
		// TODO Auto-generated method stub
		return studRepo.getClassNameAndGender(classname,gender);
	}
	
}
