package com.Assignment1;
import java.time.LocalDate;
import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int year = s.nextInt();
        System.out.println("Enter Month : ");
        int month = s.nextInt();
        System.out.println("Enter Day : ");
        int day = s.nextInt();
        s.close();
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println("Date :"+date+" "+date.getDayOfWeek());
    }
}
