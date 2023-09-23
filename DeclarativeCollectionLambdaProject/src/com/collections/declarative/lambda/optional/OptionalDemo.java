package com.collections.declarative.lambda.optional;

import java.util.Optional;

import com.collections.declarative.lambda.consumerInterface.Student;
import com.collections.declarative.lambda.consumerInterface.StudentDataBase;

public class OptionalDemo {
	
	/*
	 * 
	 * Optional class demo
	 * Optional class is used to avoid NULL Pointer Exception
	 * and unnecessary null checks
	 * 
	 * 
	 * 
	 * */

	
	public static Optional<String> getstudentname(){
		
		Optional<Student> studnetOpt = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		if(studnetOpt.isPresent()) {
			return studnetOpt.map((s->s.getName()));
		}
		return Optional.empty(); 
			
	}
	
	public static void main(String[] args) {
		Optional<String> stringOptional =getstudentname();
		if(stringOptional.isPresent()) {
			System.out.println("Lenght of name is "+stringOptional.get().length());
		}
		else {
			System.out.println("Name is not present");
		}
	}
}
