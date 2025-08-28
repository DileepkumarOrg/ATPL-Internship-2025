package com.Assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionSort {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>(Arrays.asList( "Banana", "Apple", "Mango", "Cherry"));
		Collections.sort(fruits, (s1, s2) -> s2.compareTo(s1));
		System.out.println(fruits);

	}

}


//	Output : [	Mango, Cherry, Banana, Apple]
