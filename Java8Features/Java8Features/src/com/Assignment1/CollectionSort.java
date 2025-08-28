package com.Assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter fruits with commas : ");
		String strArray = s.nextLine();
		String[] str = strArray.split(",");
		ArrayList<String> fruits = new ArrayList<>();
		for(int index = 0; index < str.length; index++){
			fruits.add(str[index].trim());
		}
		Collections.sort(fruits, (s1, s2) -> s2.compareTo(s1));
		System.out.println(fruits);

	}

}


//	Output : [	Mango, Cherry, Banana, Apple]
