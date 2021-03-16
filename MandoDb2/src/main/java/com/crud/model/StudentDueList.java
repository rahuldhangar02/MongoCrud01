package com.crud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "StudentDueList")
public class StudentDueList {

	   @Id
	   private int id;
	   
	   
	
}
