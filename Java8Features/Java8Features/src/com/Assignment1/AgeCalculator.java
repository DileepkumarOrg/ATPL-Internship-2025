package com.Assignment1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
	static Period age;
    public static void calculateAge(LocalDate birthDate, LocalDate currentDate) {
		age = Period.between(birthDate, currentDate);
    	if (age.getYears() >= 0 && age.getMonths() >= 0 && age.getDays() >= 0) {
    		System.out.println("Years : "+age.getYears()+" Months : "+age.getMonths()+" Days : "+age.getDays());
    	}
    	else System.out.println("Enter Correct Date of Birth..!");
		
		
    }
    
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter Year of Birth :");
    	int year = s.nextInt();
    	System.out.println("Enter your Month of Birth :");
    	int month = s.nextInt();
    	System.out.println("Enter your Day of Birth :");
    	int day = s.nextInt();
    	s.close();
		LocalDate birthdate = LocalDate.of(year, month, day);
		LocalDate current = LocalDate.now();
		calculateAge(birthdate, current);
		
	}
}



//Output : 
//	Enter Year of Birth :
//		2003
//		Enter your Month of Birth :
//		9
//		Enter your Day of Birth :
//		21
//		Years : 21 Months : 11 Days : 7
