package com.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.FeeMaster;
import com.crud.model.Student;
import com.crud.repository.FeeMasterRepository;
import com.crud.repository.StudentRepository;

@Service
public class FeeMasterService {

	
	@Autowired
	private FeeMasterRepository repo;
	
	
    
     

     
 
	/// list student
	
	public List<FeeMaster> getAllFee()
	{
		
		return repo.findAll();
	}
	
	
	// get fee by session
	public List<FeeMaster> getFeeBySession(String session)
	{
		return repo.getFeeBySession(session);
				
	}
	
	
	// save Student
	
	public FeeMaster saveFee(FeeMaster fee)
	{
		return repo.save(fee);
	}
	
	// get Student
	public Optional<FeeMaster> getFeeById(int id)
	{
		
		return repo.findById(id);
	}
	
	// delete Student by Id
	
	public void deleteFeeById(int id)
	{
	repo.deleteById(id);
	}

	public List<FeeMaster> getFeeByClassAndSession(String classname,String session) {
		
		return repo.getFeeByClassAndSession(classname,session);
	}

	

	
	
}
