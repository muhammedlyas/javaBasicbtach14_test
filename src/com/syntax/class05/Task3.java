package com.syntax.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int num = input.nextInt();
		
		if(num>=1 && num<=10) 
		{
			System.out.println("Small");
		}
		else if(num>=11 && num<=100)
		{
			System.out.println("Medium");
		}
		else if(num>=101&& num<=1000)
		{
			System.out.println("Large");
		}
		else
		{
			System.out.println("Invalid number");
		}
			
		
		

	}

}
