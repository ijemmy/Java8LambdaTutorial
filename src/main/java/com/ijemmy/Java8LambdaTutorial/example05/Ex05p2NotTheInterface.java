package com.ijemmy.Java8LambdaTutorial.example05;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer; //Not really required

public class Ex05p2NotTheInterface {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 3, 2, 4, 7, 8, 9, 6, 5);
		l.forEach(Ex05p2NotTheInterface::methodWithSameInput);
	}	
	
	public static int methodWithSameInput(Integer i ){
		System.out.println(i + 10);
		return 10; //Even it returns int, it still work 
	}

}
