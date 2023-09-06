package com.collections.declarative.lambda.consumerInterface;

import java.util.List;

public class Student {
	
	
	private String name;
	private int gradeLevel;
	

	private double gpa;
	private String gender;
	private int age;
	private List<String> activities1;
	private int numberOfBooks;

	public Student(String name, int gradeLevel, double gpa, String gender, int age, List<String> activities1,
			int numberOfBooks) {
		
		this.name = name;
		this.gradeLevel = gradeLevel;
		this.gpa = gpa;
		this.gender = gender;
		this.age = age;
		this.activities1 = activities1;
		this.numberOfBooks = numberOfBooks;
	}

	public int getNumberOfBooks() {
		return numberOfBooks;
	}

	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}

	

    public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(String s) {
        this.name = s;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    //List<String> activities = new ArrayList<>();

    public  List<String> getActivities() {
        return this.activities1;
    }

    public void setActivities(List<String> activities) {
        this.activities1 = activities;
    }

    public void printListOfActivities(){

        System.out.println("List of Activities are : " + this.activities1);
    }
    
    @Override
	public String toString() {
		return "Student [name=" + name + ", gradeLevel=" + gradeLevel + ", gpa=" + gpa + ", gender=" + gender + ", age="
				+ age + ", activities1=" + activities1 + ", numberOfBooks=" + numberOfBooks + "]";
	}
    
}