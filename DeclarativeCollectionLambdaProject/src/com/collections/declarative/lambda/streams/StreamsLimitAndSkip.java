package com.collections.declarative.lambda.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitAndSkip {

	
	public static Optional<Integer> limitDemo(List <Integer> listNum){
		
		return listNum.stream()
				.limit(2) //Stream<Integer>..limits to first 2 elements in list
				.reduce((x,y)->x+y);
	}
	
public static Optional<Integer> skipDemo(List <Integer> listNum){
		
		return listNum.stream()
				.skip(2) //Stream<Integer>..Skips first 2 elements in list
				.reduce((x,y)->x+y);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Integer> listNum = Arrays.asList(1,2,3,4,5,6);
		Optional<Integer> optLimitNum = limitDemo(listNum); //1,2
		if(optLimitNum.isPresent()) {
			System.out.println(optLimitNum.get());
		}
		
		Optional<Integer> optSkipNum = skipDemo(listNum); //3,4,5,6
		
		if(optSkipNum.isPresent()) {
			System.out.println(optSkipNum.get());
		}
		
		

	}

}
