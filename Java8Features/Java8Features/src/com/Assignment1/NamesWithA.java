package com.Assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NamesWithA {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter names with commas : ");
		String strNames = s.nextLine();
		String[] strArray = strNames.split(",");
		List<String> names = new ArrayList<>();
		for(int index = 0; index < strArray.length; index++){
			names.add(strArray[index].trim());
		}
		names.forEach((name) ->{
			if (name.toUpperCase().startsWith("A")) {
				System.out.print(name+" ");
			}
		});
	}

}

//	Output : Alice Andrew Angela 
