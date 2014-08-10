package com.ijemmy.Java8LambdaTutorial.example06;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex06ReturningLambda {
	
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 3, 2, 4);
		l.forEach(getConsumer(10));
		
	}
	
	public static Consumer<Integer> getConsumer(int multiplier){
		int fixedNumber = 10;
		//fixedNumber++; //Must be effectively final
		return x -> {
			System.out.println(x * fixedNumber * multiplier);
		};
	}
	
}
