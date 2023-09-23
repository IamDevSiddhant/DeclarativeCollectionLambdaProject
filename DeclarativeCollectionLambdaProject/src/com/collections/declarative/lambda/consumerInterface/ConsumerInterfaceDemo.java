package com.collections.declarative.lambda.consumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceDemo {

	//static Consumer<String> c1= (s) -> System.out.println(s.toUpperCase());;
	static Consumer<Student> c2 = (Student) -> System.out.println(Student.getName());
	static Consumer<Student> c3 = (Student) -> System.out.println(Student.getActivities());
	static Consumer<List<String>> c4 = (getActivities)->System.out.println(getActivities);
	public static void printNameofAllStudents() {
		List<Student> s1 = StudentDataBase.getAllStudents();
		s1.forEach(c2);
	}
	
	public static void printActivitiesofAllStudents() {
		List<Student> s1 = StudentDataBase.getAllStudents();
		s1.forEach(c2.andThen(c3));
	}
	
	public static void main(String[] args) {
		
		//c1.accept("sid");
		printNameofAllStudents();
		printActivitiesofAllStudents();
		
		c4.accept(Arrays.asList("1","2"));
		

	}

}
