package com.Assignment1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter numbers with commas : ");
		String numberStr = s.nextLine();
		String[] numberArray = numberStr.split(",");
		List<Integer> numbers = new LinkedList<>();
		for(int index = 0 ; index < numberArray.length; index++){
			numbers.add(Integer.valueOf(numberArray[index]));
		}
		numbers.forEach((number) -> System.out.print(number*number + " "));
		s.close();
	}

}

//Output : 1 4 9 16 25 

