package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyBoard3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("please enter your age");
		
		int age =scanner.nextInt(); //we use nextInt() if we want an int type of data from the keyboard
		
		if(age<18)
		{
			System.out.println("you should study");
		}
		else
		{
			System.out.println("you should start working");
		}

	}

}
