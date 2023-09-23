package com.collections.declarative.lambda.defaultstaticdemo;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.collections.declarative.lambda.consumerInterface.Student;
import com.collections.declarative.lambda.consumerInterface.StudentDataBase;

/*
 * 
 * Comparator and methods
 * 
 * 
 * 
 * */


public class DefaultInterfaceMethods2 {

	static Consumer<Student> studentConsumer = (student)->System.out.println(student);
	static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
	static Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);
	static Comparator<Student> gradeComparator = Comparator.comparingInt(Student::getGradeLevel);
	
	public static void sortByname(List<Student>studentList) {
		System.out.println("After Sorting By Name");
		studentList.sort(nameComparator.reversed());
		studentList.forEach(studentConsumer);
		
	}
	
	public static void sortBygpa(List<Student>studentList) {
		System.out.println("After Sorting By GPA");
		studentList.sort(gpaComparator);
		studentList.forEach(studentConsumer);
		
	}
	
	public static void chainSort(List<Student>studentList) {
		System.out.println("After Sorting By GPA and name");
		studentList.sort(gradeComparator.thenComparing(nameComparator));
		studentList.forEach(studentConsumer);
		
	}
	
	
	public static void main(String[] args) {
		
//		System.out.println("Before Sorting");
		List<Student> studlist = StudentDataBase.getAllStudents();
//		studlist.forEach(studentConsumer);
		//sortByname(studlist);
		
//		sortBygpa(studlist);
//		
		chainSort(studlist);

	}

}
