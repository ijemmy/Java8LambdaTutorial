package com.ijemmy.Java8LambdaTutorial.example03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex03FunctionalInterface {
	@FunctionalInterface
	interface IntValidator{ //Single Abstract Method
		//First abstract method
		public boolean validate(int i); 
		
		//Another abstract method not allowed
		//public boolean validate2(int i); 
		
		//default "implemented" method allowed
		public default boolean validate3(int i){
			return i < 3;
		};
		
		//Overridden abstract methods from Object are allowed
		@Override
		public boolean equals(Object o);
	}
	
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 3, 2, 4);
		System.out.println(filterInt(l, i ->  i >= 3 ));
	}
	
	public static List<Integer> filterInt(List<Integer> input, IntValidator filter){
		List<Integer> l = new ArrayList<Integer>();
		for(Integer i : input){
			if(filter.validate(i)){
				l.add(i);
			}
		}
		return l;
	}
}
