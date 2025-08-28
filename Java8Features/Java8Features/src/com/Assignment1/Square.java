package com.Assignment1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Square {

	public static void main(String[] args) {
		List<Integer> numbers = new LinkedList<>(Arrays.asList(1,2,3,4,5));
		
		numbers.forEach((number) -> System.out.print(number*number + " "));

	}

}

//Output : 1 4 9 16 25 

