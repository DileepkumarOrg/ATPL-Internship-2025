package com.Assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NamesWithA {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Andrew", "Tom", "Angela", "Steve")) ;
		names.forEach((name) ->{
			if (name.startsWith("A")) {
				System.out.print(name+" ");
			}
		});
	}

}

//	Output : Alice Andrew Angela 
