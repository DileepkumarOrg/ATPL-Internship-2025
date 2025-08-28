package com.Assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter numbers with commas : ");
		String numberString = s.nextLine();
		String[]  numberArray = numberString.split(",");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int index = 0; index> numberArray.length; index++) {
			numbers.add(Integer.valueOf(numberArray[index]));
		}
		//ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers.forEach((num)->{
			if (num%2 == 0) {
				System.out.print(num+" ");
			}
		});
	}

}


//	Output : 2 4 6 8 10 
