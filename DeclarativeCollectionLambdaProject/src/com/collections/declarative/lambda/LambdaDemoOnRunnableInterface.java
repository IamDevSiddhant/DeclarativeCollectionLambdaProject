package com.collections.declarative.lambda;

public class LambdaDemoOnRunnableInterface {

	public static void main(String[] args) {
		
		/*Old legacy way of handling functional interface 
		 * (SAM)
		 * SINGLE ABSTARCT METHOD
		 * */
		Runnable runnableOld = new Runnable() {
			@Override
			public void run() {
				
				System.out.println("Inside anonymoys function");
				
			}
		};
		new Thread(runnableOld).start();
		
		/*
		 * NEW AND BETTER WAY USING LAMBDA
		 * 
		 * SYNTAX FOR LAMBDA IS
		 * () -> {}
		 * () : INPUT PARAMS FOR METHOD IN @FUNCTIONAL INTERFACE
		 * -> : ARROW OPERATOR
		 * {} : BODY FOR LAMBDA EXPRESSION
		 * */
		
		Runnable runnableNew  = () -> 
		{
			System.out.println("INSIDE LAMBDA EXPRESSION");
		};
		new Thread(runnableNew).start();
		
		/*lets make it more simpler 
		 * in case of only one statement no need to use {}
		 * but if you have more than 1 statements to print, use {}
		 * */
		Runnable runnableNew1 = () -> System.out.println("Inside Lambda, if you have one statement to print no need to use {}");
		new Thread(runnableNew1).start();
		
		/*Lets make it even more simpler
		 * lets reduce number of lines of code
		 * */
		
		new Thread(()->System.out.println("INSIDE LAMBDA EXPRESSION without creating reference variable for interface")).start();
	}

}
