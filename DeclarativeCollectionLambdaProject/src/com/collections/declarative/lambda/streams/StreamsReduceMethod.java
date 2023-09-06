package com.collections.declarative.lambda.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.collections.declarative.lambda.consumerInterface.Student;
import com.collections.declarative.lambda.consumerInterface.StudentDataBase;

public class StreamsReduceMethod {

	
	
	/*
	 * we can use reduce method for stream
	 * 
	 * if you dont want to use default as 1 (u can see getMultiplication this method)
	 * then you can use optional return type 
	 * 
	 * */
	public static int getMultiplication(List<Integer> intList) {

		return intList.stream().reduce(1, (a, b) -> a * b);

	}

	public static Optional<Integer> getMultiplicationWithOptional(List<Integer> intList) {

		return intList.stream().reduce((a, b) -> a * b);

	}
	
	public static Optional<Student> getMultiplicationWithOptionalStudents() {

		return StudentDataBase.getAllStudents()
				.stream()
				.reduce( (s1,s2) -> (s1.getGpa()>s2.getGpa())? s1:s2);

	}

	public static void main(String[] args) {

		List<Integer> listOfInt = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("Multiplying using Stream reduce method " + getMultiplication(listOfInt));

		if (getMultiplicationWithOptional(listOfInt).isPresent()) {
			System.out.println("Multiplying using Stream reduce method but with Optional Return Type "
					+ getMultiplicationWithOptional(listOfInt).get());
		}
		
		Optional<Student> studentOptional = getMultiplicationWithOptionalStudents();
		
		if(studentOptional.isPresent()) {
			System.out.println("Stream of Students: "+studentOptional.get());
		}
		
	}

}
