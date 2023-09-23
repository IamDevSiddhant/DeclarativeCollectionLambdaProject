package com.collections.declarative.lambda.streams;



import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.collections.declarative.lambda.consumerInterface.Student;
import com.collections.declarative.lambda.consumerInterface.StudentDataBase;

/*sorting students based on gpa , 
in DistinctDemp.java 
we are sorting list of string so no need to use comparable over there*/


public class StreamsComparatorDemo {

	public static List<Student> getStudentsByName(){
		//creating stream of students & sorting based on name
		return StudentDataBase.getAllStudents()
				.stream()
				.sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
	}
	
	public static List<Student> getStudentsByGpa(){
		//creating stream of students & sorting based on name
		return StudentDataBase.getAllStudents()
				.stream()
				.sorted(Comparator.comparing(Student::getGpa).reversed()) 
				.collect(Collectors.toList());
	}
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Students Sorted by their Name ");
		//System.out.println(getStudentsByName());
		getStudentsByName().forEach(System.out::println);
		System.out.println("Students Sorted by their Gpa Highest first ");
		getStudentsByGpa().forEach(System.out::println);
	}

}
