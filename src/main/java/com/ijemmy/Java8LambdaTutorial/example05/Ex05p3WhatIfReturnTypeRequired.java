package com.ijemmy.Java8LambdaTutorial.example05;

import java.util.ArrayList;
import java.util.List;

public class Ex05p3WhatIfReturnTypeRequired {
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(3);
		l.add(2);
		l.add(1);
		l.add(4);
		l.removeIf( i -> {
			return i >= 3;//No return statement will break compilation
		});
		System.out.println(l);
	}
	
}
