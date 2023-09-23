package com.collections.declarative.lambda.intstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntStreamDemo {

	
	public static int sumOfNumbers(List<Integer>intList) {
		
		
		return intList
				.stream()
				.reduce(0, (x,y)->x+y);//this method is unwrapping Integer to int
	}
	
	public static int sumOfNumbersUsingIntStream() {
		return IntStream
				.rangeClosed(1, 4)
				.sum();
	}
	
	
	public static void main(String[]args) {
		
		
		List<Integer> integerList = Arrays.asList(1,2,3,4);
		System.out.println("sum of numbers using Reduce Function() "+sumOfNumbers(integerList));
		System.out.println("sum of numbers using Int Stream() "+sumOfNumbersUsingIntStream());
	}
}
