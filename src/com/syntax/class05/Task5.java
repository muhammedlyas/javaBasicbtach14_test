package com.syntax.class05;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your birth month");
		
		String month = input.next();
		
		if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February"))
		{
			System.out.println("You Were born is season Winter");
		}
		else if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May"))
		{
			System.out.println("You Were born is season Spring");
		}
		else if(month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August"))
		{
			System.out.println("You were born is season Summer");
		}
		else if(month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November"))
		{
			System.out.println("You were born is season Automn");
		}
		else
		{
			System.out.println("Invalid month");
		}
		

	}

}
