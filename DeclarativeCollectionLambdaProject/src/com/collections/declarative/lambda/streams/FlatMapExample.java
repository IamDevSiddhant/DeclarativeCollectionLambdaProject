package com.collections.declarative.lambda.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.collections.declarative.lambda.consumerInterface.Student;
import com.collections.declarative.lambda.consumerInterface.StudentDataBase;

public class FlatMapExample {
public static List<String> studentList(){
	/*
	 * Flatmap is used to flatten the map
	 * for below example we are expecting list of string as return value
	 * but below when we use map we are calling getactivities which is a list of string
	 * so to overcome this issue we are using FlatMap
	 * it converts one form to other
	 * 
	 * */	
	
	
		return StudentDataBase.getAllStudents()
				.stream()
				.filter((s->s.getGpa()>3.7))
				.map(Student::getActivities)//List<List<String>>
				.flatMap(List::stream)//List<String>
				.collect(Collectors.toList());
		
	}
	public static void main(String[] args) {
		
		System.out.println("Using FaltMap "+studentList());
		
	}

}
