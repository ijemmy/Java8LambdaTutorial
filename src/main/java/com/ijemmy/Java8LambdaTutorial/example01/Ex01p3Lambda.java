package com.ijemmy.Java8LambdaTutorial.example01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Ex01p3Lambda {
	interface Predicate{
		public boolean test(int i); 
	}
	
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 3, 2, 4);
		System.out.println(filterInt(l, i ->  i >= 3 ));
		
		/*
		 * There are Many ways to write lambda
		 * 1. (i) 	  -> i >= 3
		 * 2. (int i) -> return i >= 3
		 * 3. i -> {
		 * 		//do many things
		 * 		return i >= 3;
		 * 	  }
		 */
		
	}
	
	public static List<Integer> filterInt(List<Integer> input, Predicate filter){
		List<Integer> l = new ArrayList<Integer>();
		for(Integer i : input){
			if(filter.test(i)){
				l.add(i);
			}
		}
		return l;
	}
}
