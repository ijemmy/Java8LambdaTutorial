package com.ijemmy.Java8LambdaTutorial.example04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex04p2CheatEffectivelyFinal {
	
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 3, 2, 4, 7, 8, 9, 6, 5);
		IntWrapper variableOutside = new IntWrapper(50);
		Consumer<Integer> consumer = i -> { 
			int variableInside = 70; 
			variableOutside.incr(); //Imagine multi-thread environment calling this
			variableInside++;
			System.out.printf("%s plus %d plus %d equals %d\n", variableOutside, variableInside, i, variableOutside.getInt()+variableInside+i);
		};
		variableOutside.incr(); //Now it's the variableOutside starts from 51
		l.forEach(consumer);
	}

}
