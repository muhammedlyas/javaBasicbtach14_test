package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner is a class that helps us take the input from the keyboard
		 * it contains many different smaller modules called methods that can helps us
		 * take String booleans basically all types of data from the keyboard 
		 */
		Scanner input = new Scanner(System.in);
		// A messeage will be displayed to the user on the console to enter his/her name
		System.out.println("please enter your name");
		//activates the java program to take input from the keyboard 
		String name = input.next();
		System.out.println("hello "+name);
		
		
		

	}

}
