package com.collections.declarative.lambda.optional;

import java.util.Optional;

import com.collections.declarative.lambda.consumerInterface.Student;
import com.collections.declarative.lambda.consumerInterface.StudentDataBase;

public class FilterMapFlatMapInOptional {

	//filter
	
	public static void optionalfilter() {
		Optional<Student> optstudent = 
				Optional.ofNullable(StudentDataBase.studentSupplier.get());
		
		optstudent
			.filter((s)->s.getGpa()>=3.5)
				.ifPresent((s)->System.out.println(s.getAge()));
	}
	
	
	
	//map
	public static void optionalmap() {
		Optional<Student> optstudent = 
				Optional.ofNullable(StudentDataBase.studentSupplier.get());
		if(optstudent.isPresent()) {
		Optional<String>namestud =optstudent
			.filter((s)->s.getGpa()>=3.5)
				.map((s->s.getName()));
		System.out.println(namestud.get());
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		optionalfilter();
		optionalmap();
	}

}
