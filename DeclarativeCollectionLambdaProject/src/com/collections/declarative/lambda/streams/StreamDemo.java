package com.collections.declarative.lambda.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.collections.declarative.lambda.consumerInterface.Student;
import com.collections.declarative.lambda.consumerInterface.StudentDataBase;

public class StreamDemo {

	public static void main(String[] args) {

		// Predicate Interface use cases
		/*
		 * It returns boolean value
		 */
		Predicate<Student> pr1 = (Student) -> {
			return Student.getGpa() >= 3;
		};
		Predicate<Student> pr2 = (Student) -> {
			return Student.getAge() > 5;
		};
		
		List<Student> studDboriginal = StudentDataBase.getAllStudents();
		
		Consumer<Student> consumestudent = (Student stud)->{
			if(pr1.and(pr2) != null) {
				System.out.println("Name of Students using consumer interface " + stud.getName());
			}
			
		};
		
		//studDboriginal.forEach(consumestudent);
		
		//directly you can use consumer interface 
		studDboriginal.forEach((student -> {
			if(pr1.and(pr2)!= null) {
				System.out.println("Name of Students Activities using consumer interface "+student.getActivities());
			}
		}));

		List<Student> studDb = StudentDataBase.getAllStudents();

		System.out.println("Calling StudentDataBase Class Method "+studDb);
		//Iterating over every Student object
		//for Each method can be used for lists
		studDb.forEach(Student -> {
			if (pr1.and(pr2) != null) {
				System.out.println("Name of Students using predicate in for each directly " + Student.getName());
					}
				});
		//for each method is best usage to iterate over a list in enterprise java
		
		
		//using enhanced for loop
		for(Student st : studDb) {
			System.out.println("Using Enhanced for Loop "+st);
		}
		
		
		//using iterator 
		
		Iterator <Student> itr = studDb.iterator();
		while(itr.hasNext()) {
			System.out.println("Using Iterator "+itr.next());
		}
		
		

		/*
		 * Customizing
		 * 
		 * for my understanding below example is
		 */

		System.out.println("pr1.test() "
				+ pr1.test(new Student("xyz", 4, 3.7, "Male", 11, Arrays.asList("Football", "Cricket", "Basketball"),9)));

		// System.out.println("pr1 and pr2 ()"+pr1.and(pr2));
		
		//Functional Interface Use cases
		/*
		 * 
		 * it takes 2 params input and output
		 * u can see use case for lambda expression "str"
		 * 
		 * 
		 * */
		Function<String, Integer> str = (s) -> {
			return s.equalsIgnoreCase("Siddhant") ? 1 : 0;
		};
		System.out.println(str.apply("Siddhant"));
		
		/*Simple use case of predicate interface and 
		 * lambda expression implementation
		*/
		
		Predicate<String> pr11 = (String s1) -> {
			if (s1.equalsIgnoreCase("abc"))
				return true;
			return false;
		};

		System.out.println(pr11.test("abc"));

		
		/*Below is example of STREAM API*/
		
		
		Map<String, List<String>> StudentMap = StudentDataBase.getAllStudents().stream().filter(pr1)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));

		System.out.println(StudentMap);
	}

}
