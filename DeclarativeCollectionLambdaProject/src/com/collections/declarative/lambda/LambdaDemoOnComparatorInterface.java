package com.collections.declarative.lambda;

import java.util.Comparator;

public class LambdaDemoOnComparatorInterface {

	public static void main(String[] args) {
		
		/*lets start with legacy way*/
		Comparator<Integer> compareIntsUsingAnonysmousClass
		= new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
			
		};
		
	System.out.println("Comparing two integers using anonymous class "+
			compareIntsUsingAnonysmousClass.compare(11, 10));
	/*now lets use lambda expression*/
	Comparator<Integer> compareIntsUsingLambda = (Integer a, Integer b) -> {
		return a.compareTo(b);
	};

	System.out.println("Comparing two integers using Lambda expression "
	+compareIntsUsingLambda.compare(7, 11));
	
	
	}
}
