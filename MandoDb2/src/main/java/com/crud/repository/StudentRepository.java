package com.crud.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.crud.model.FeeMaster;
import com.crud.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student,Integer> {

	@Query("{'firstName' : ?0}")
	public List<Student> findByFirstName(String firstname);

	 @Query("{$and:[{'className':?0},{'parents.contact':?1}]}")
	 public List<Student> findByClassNameAndMobile(String className,long contact);

	  @Query("{$and:[{'className':?0},{'gender':?1}]}")
	public List<Student> getClassNameAndGender(String classname, String gender);
	
	
	
	


	
}
