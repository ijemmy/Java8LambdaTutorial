package com.ijemmy.Java8LambdaTutorial.example02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex2Sorting {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Cloud Strife", 21));
		people.add(new Person("Tifa Lockheart", 20));
		people.add(new Person("Barret Wallace", 35));
		people.add(new Person("Aeris Gansborough", 22));
		people.sort(Comparator.comparing(Person::getName));
		System.out.println(people);
	}

}
