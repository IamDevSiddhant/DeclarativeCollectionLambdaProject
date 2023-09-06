package com.collections.declarative.lambda.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.collections.declarative.lambda.consumerInterface.Student;
import com.collections.declarative.lambda.consumerInterface.StudentDataBase;

public class DistinctDemp {

	public static List<String> studentList(){
		
		return StudentDataBase.getAllStudents()
				.stream()
				.filter((s->s.getGpa()>3.7))
				.map(Student::getActivities)//List<List<String>>
				.flatMap(List::stream)//List<String>
				.distinct() // unique values will be fetched, will dispose duplicates
				.sorted() //this method will sort the Stream<String> in alphabetical order
				.collect(Collectors.toList());
		
	}
	
	
	public static long countActivities() {
		
		return StudentDataBase.getAllStudents()
				.stream()
				.filter((s->s.getGpa()>3.7))
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.count();//counts unique activities from stream
				
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("student List with unique values in sorted format "+studentList());
		System.out.println("Count of Acitivities is "+countActivities());
	}

}
