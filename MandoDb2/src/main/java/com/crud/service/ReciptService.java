package com.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Recipt;
import com.crud.repository.ReciptRepository;

@Service
public class ReciptService {

	@Autowired
	private ReciptRepository repo;
	
	
	// get All recipt
	 public List<Recipt> getAllRecipt()
	 {
		return repo.findAll();
	 }
	 
	 /// save Recipt
	  public Recipt addRecipt(Recipt recipt)
	  {
		  return repo.save(recipt);
	  }
	  
	  // get Recipt by Id
	  public Optional<Recipt> getReciptById(int id)
	  {
		  return repo.findById(id);
	  }
	  
	  // delete Recipt By Id
	  public void deleteReciptById(int id)
	  {
		  repo.deleteById(id);
	  }
	 
	 
}
