package com.collections.declarative.lambda.streams;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.collections.declarative.lambda.consumerInterface.Student;
import com.collections.declarative.lambda.consumerInterface.StudentDataBase;

public class MapMethodInStream {

	public static List<String> studentList(){
		
		return StudentDataBase.getAllStudents()
				.stream()
				.filter((s->s.getGpa()>3.7))
				.map(Student::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("student List "+studentList());

	}

}
