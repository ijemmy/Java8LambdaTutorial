package com.ijemmy.Java8LambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Example01 {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 3, 2, 4);
		System.out.println(filterInt(l));
	}
	
	public static List<Integer> filterInt(List<Integer> input){
		List<Integer> l = new ArrayList<Integer>();
		for(Integer i : input){
			if(i >=3){
				l.add(i);
			}
		}
		return l;
	}
}
