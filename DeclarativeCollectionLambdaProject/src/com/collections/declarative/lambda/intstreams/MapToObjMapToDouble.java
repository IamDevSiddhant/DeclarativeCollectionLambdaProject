package com.collections.declarative.lambda.intstreams;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapToObjMapToDouble {
	
	
	public static List<Integer> mapToobj() {
		
	return	IntStream
		.rangeClosed(1, 50)
		.mapToObj((i)->{
			return new Integer(i); //mapping to object //input will be primitive datatype and o/p will be Integer Object
		//we can use any class object
		}).collect(Collectors.toList());
	}
	
	public static Long mapToLongStream() {
		return IntStream
				.rangeClosed(1, 5)
				.mapToLong((i->i)) //will convert intstream to longstream
				.sum();
	}
	
	public static OptionalDouble mapToDoubleStream() {
		return IntStream
				.rangeClosed(1, 10)
				.mapToDouble((i->i))
				.average();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("List "+mapToobj());
		
		System.out.println("mapToLongStream->sum "+mapToLongStream());
		
		System.out.println("mapToDoubleStream->avg "+mapToDoubleStream());

	}

}
