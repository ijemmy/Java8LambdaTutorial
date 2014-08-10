package com.ijemmy.Java8LambdaTutorial.example04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex04LocalVariable {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 3, 2, 4, 7, 8, 9, 6, 5);
		int variableOutside = 50;
		Consumer<Integer> consumer = i -> { //Type of i can be implicitly known
			int variableInside = 70; 
			variableInside++;
			System.out.printf("%d plus %d plus %d equals %d\n", variableOutside, variableInside, i, variableOutside+variableInside+i);
		};
		//variableOutside = 100; //Must be effectively final
		l.forEach(consumer);
	}

}
