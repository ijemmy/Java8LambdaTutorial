package com.ijemmy.Java8LambdaTutorial.example06;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import com.ijemmy.Java8LambdaTutorial.example04.IntWrapper;

public class Ex06ReturningLambdaEffectivelyFinal {
	
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 3, 2, 4);
		l.forEach(getConsumer(10));
		
	}
	
	public static Consumer<Integer> getConsumer(int multiplier){
		IntWrapper iWrapper = new IntWrapper(10); //Let's use Intwrapper to cheat effectively final
		Consumer<Integer> lambdaToReturn =  x -> {
			System.out.println(x * iWrapper.getInt() * multiplier);
		};
		iWrapper.incr(); //Even we increment it later, our lambda still get 11 instead of 10
		return lambdaToReturn;
	}
	
}
