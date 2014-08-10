package com.ijemmy.Java8LambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Example03 {
	interface Predicate{
		public boolean test(int i); 
	}
	
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 3, 2, 4);
		System.out.println(filterInt(l, new Predicate(){
			public boolean test(int i){
				return i >= 3;
			}
		}));
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
