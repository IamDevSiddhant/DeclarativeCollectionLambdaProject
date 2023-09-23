package com.collections.declarative.lambda.optional;

import java.util.Optional;

import com.collections.declarative.lambda.consumerInterface.Student;
import com.collections.declarative.lambda.consumerInterface.StudentDataBase;

public class OrElse {
	
	/*
	 * 
	 * Optional
	 * orelse
	 * orelseget
	 * 
	 * */
	
	
	//orelse
	public static String optionalorElse() {
		Optional<Student> optionalorelse = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		//Optional<Student> optionalorelse = Optional.ofNullable(null);
		String name = optionalorelse.map((s->s.getName())).orElse("default");
		return name;
	}
	
	
	//orelseget
	public static String orelseget() {
		//Optional<Student> optionalorelse = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> optionalorelse = Optional.ofNullable(null);
		String name = optionalorelse.map((s->s.getName())).orElseGet(()->"default");
		return name;
	}
	
	
	//orelsethrow
	public static String orelsethrow() {
		Optional<Student> optionalorelse = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		//Optional<Student> optionalorelse = Optional.ofNullable(null);
		String name = optionalorelse.map((s->s.getName())).orElseThrow(()-> 
		new RuntimeException("No Data Available"));
		return name;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("(optionalorElse)Name "+optionalorElse());
		System.out.println("(orelseget)Name "+orelseget());
		System.out.println("(orelsethrow)Name "+orelsethrow());
		

	}

}
