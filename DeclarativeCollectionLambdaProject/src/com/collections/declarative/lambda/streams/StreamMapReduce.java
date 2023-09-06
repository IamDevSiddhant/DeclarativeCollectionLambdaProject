package com.collections.declarative.lambda.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.collections.declarative.lambda.consumerInterface.Student;
import com.collections.declarative.lambda.consumerInterface.StudentDataBase;

public class StreamMapReduce {

	public static int getBooksCountUsingReduce() {
		
		
		return StudentDataBase.getAllStudents()
				.stream() //Stream<Students>
				.map(Student::getNumberOfBooks)//Stream<Integer>
				.reduce(0, (a,b)->a+b);
		
	}
	
	public static String getStudentsByName(){
		//creating stream of students & sorting based on name
		return StudentDataBase.getAllStudents()
				.stream()
				.filter((s->s.getGpa()>4))
				.sorted(Comparator.comparing(Student::getName).reversed())
				.collect(StringBuilder::new, StringBuilder::append,StringBuilder::append)
			    .toString();
	}
	
	public static void main(String[] args) {
		String s = "";
		s=getStudentsByName();
		System.out.println(s);
	}

}
