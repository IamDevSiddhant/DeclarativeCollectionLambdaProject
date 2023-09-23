package com.collections.declarative.lambda.defaultstaticdemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultInterfacemethods {

	public static void main(String[] args) {
		
		
		List<String> fruitList = Arrays.asList("banana","apple","mango",
				"watermelon","pineapple","strawberry","cherry");
		
		/*
		 * Prior java 8
		 * 
		 * */
//		Collections.sort(fruitList);
//		System.out.println("Sorted List with Collections.sort() "+fruitList);
//		
		/*
		 * since java 1.8
		 * */

		fruitList.sort(Comparator.naturalOrder());
		System.out.println("Sorted List with List.sort() "+fruitList);
		

		fruitList.sort(Comparator.reverseOrder());
		System.out.println("Sorted List with List.sort() reverse "+fruitList);
		
	}

}
