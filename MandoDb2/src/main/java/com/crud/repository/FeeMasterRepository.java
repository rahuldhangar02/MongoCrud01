package com.crud.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.crud.model.FeeMaster;

@Repository
public interface FeeMasterRepository extends MongoRepository<FeeMaster,Integer> {

	
	@Query("{$and:[{'className':?0},{'session':?1}]}")
	List<FeeMaster> getFeeByClassAndSession(String className, String session);
 
	// search by fee session
	@Query("{'session':0?}")
	List<FeeMaster> getFeeBySession(String session);

}
