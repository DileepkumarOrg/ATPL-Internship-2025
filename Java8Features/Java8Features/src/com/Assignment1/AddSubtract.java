package com.Assignment1;

import java.time.LocalDate;

public class AddSubtract {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Today's Date : "+date);
        System.out.println("After adding 10 days : "+date.plusDays(10));
        System.out.println("After Subtracting s months : "+date.minusMonths(2));
    }
}


//    Output : 

//    Today's Date : 2025-08-28
//    After adding 10 days : 2025-09-07
//    After Subtracting s months : 2025-06-28
