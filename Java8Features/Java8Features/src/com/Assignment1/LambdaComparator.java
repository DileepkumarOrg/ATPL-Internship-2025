package com.Assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LambdaComparator {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter numbers with commas : ");
		String str = s.nextLine();
		String[] splittedArray = str.split(",");
		List<Integer> numbers = new ArrayList<>();
		for (int index = 0; index <splittedArray.length; index++ ) {
			numbers.add(Integer.valueOf(splittedArray[index]));
		}
		s.close();
		Collections.sort(numbers, (num1,num2) -> num2- num1);
		System.out.println(numbers);
	}
}



//	Input :
//	Enter numbers with commas : 
//	5,2,8,1,9
//	Output : 
//	[9, 8, 5, 2, 1]
