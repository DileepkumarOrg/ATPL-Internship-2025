package com.Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class EmployeeBonusEligibilityCheck {
	String name;
	int salary;
	String email;
	
	EmployeeBonusEligibilityCheck(String name, int salary, String email){
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		List<EmployeeBonusEligibilityCheck> employeeList = new ArrayList<EmployeeBonusEligibilityCheck>();
		
		employeeList.add(new EmployeeBonusEligibilityCheck("Dileep", 56000, "dileep@gmail.com"));
		employeeList.add(new EmployeeBonusEligibilityCheck("Sandeep", 50000, null));
		employeeList.add(new EmployeeBonusEligibilityCheck("Naveen", 60000, "naveen@gmail.com"));
		employeeList.add(new EmployeeBonusEligibilityCheck("Mahesh", 56000, null));
		
		Predicate<EmployeeBonusEligibilityCheck> eleigiblity = (employee) -> employee.salary > 55000;
		System.out.println("Eligible Employee list :\n\nName   Mail\n");
		employeeList.stream().filter(emp->eleigiblity.test(emp))
						     .forEach((emp)  ->{
						    	 Optional<String> emailOpt = Optional.ofNullable(emp.email);
						    	 System.out.println(emp.name+" "+emailOpt.orElse("Email not available"));
						     });
	}

}


//Output : 
//	Eligible Employee list :
//
//		Name   Mail
//
//		Dileep dileep@gmail.com
//		Naveen naveen@gmail.com
//		Mahesh Email not available

