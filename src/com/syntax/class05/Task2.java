package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter between 1 to 7 ");
		int num = input.nextInt();
		
		if(num>=1 && num<=5)
		{
			System.out.println("It is a weekdays");
		}
		else if(num>=6 && num<=7)
		{
			System.out.println("It is a weekend");
		}
		else
		{
			System.out.println("Invalid day");
		}

	}

}
