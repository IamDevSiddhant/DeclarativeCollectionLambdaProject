package com.collections.declarative.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DeclarativeDemo {

	
	public static void main(String[] args) {
		/*
		 * IMPERATIVE STYLE OF PROGRAMMING
		 * */
		
		List<Integer> intList = Arrays.asList(1,2,3,3,4,4,5,6,7,7,88,88);
		System.out.println("IntList is "+intList);
		List<Integer> uniqueList = new ArrayList<Integer>();
		//this is good for logic building but enterprise level not
		//recommended
		for(Integer intlist:intList) {
			
			if(!uniqueList.contains(intlist)) {
				uniqueList.add(intlist);
			}
		}
		System.out.println("Imperative list is "+uniqueList);
		
		
		/*Declarative Style of Programming*/
		
	List<Integer>uniqueList1=intList.stream().distinct().collect(Collectors.toList());
		System.out.println("Declarative Style of programming "+uniqueList1);
		
		Predicate<String> pr1= (a)->
		{
			if(a.equalsIgnoreCase("a"))
				return true;
			return false;
			};
		
		List<String> stringList = new ArrayList<String>();
		stringList.add("a");
		stringList.add("aa");
		boolean result = 
				stringList.stream().
				anyMatch(pr1);
		System.out.println("result "+result);
		
		
	}
	
	
}
