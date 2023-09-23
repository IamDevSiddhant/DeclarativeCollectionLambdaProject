package com.collections.declarative.lambda.streams;

import com.collections.declarative.lambda.consumerInterface.StudentDataBase;

public class StreamsAnyMatchAllMatchNoMatch {

	// if all students have gpa > or equals to 3.5 will return true
	public static boolean allMatch() {
		return StudentDataBase.getAllStudents()
				.stream()
				.allMatch((s->s.getGpa()>=3.5));
	}
	// if any students matches condition will return true
	public static boolean anyMatch() {
		return StudentDataBase.getAllStudents()
				.stream()
				.anyMatch((s->s.getGender().equalsIgnoreCase("Male")));
	}
	
	public static boolean noMatch() {
		return StudentDataBase.getAllStudents()
				.stream().noneMatch((s->s.getAge()>=25));
	}
	
	
	public static void main(String[] args) {
		System.out.println("All Match "+allMatch());
		System.out.println("Any Match "+anyMatch());
		System.out.println("No Match "+noMatch());
	}

}
