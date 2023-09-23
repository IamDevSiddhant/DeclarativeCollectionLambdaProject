package com.collections.declarative.lambda.intstreams;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStreamOperations {

	/*
	 * 
	 * IntStream Operations like max, min, average, sum
	 * 
	 * */
	public static void main(String[] args) {
		
		//IntStream ops
		int instreamsum=IntStream.rangeClosed(1, 50).sum();
		System.out.println("Count of IntSTream is "+IntStream.rangeClosed(1, 50).count());
		IntStream.rangeClosed(1, 50).forEach((value)->System.out.print(","+value));
		System.out.println();
		System.out.println("Sum Using IntStream "+instreamsum);
		
		OptionalInt optionalint= IntStream.rangeClosed(1, 50).max();
		System.out.println("max value from intStream is "+optionalint);
		
		//same way we can perform ops on double and long stream 
		
		
		
	}
	
}
