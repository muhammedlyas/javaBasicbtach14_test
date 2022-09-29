package com.syntax.class05;

import java.util.Scanner;

public class ScannerRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  to scanner import+shift+o 
		 *  nextline(); for full sentence
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		
		//to captured different values we need to use different option
		
		String name = input.next();
		System.out.println("Nice meet you "+name);
		
		System.out.println("How old are you");
		int age = input.nextInt();
		System.out.println(name+" is "+age+" years old");
		
		System.out.println("How much money you have "+name+" ?");
		double money =input.nextDouble();
		
		System.out.println(name+" has Ş"+money);
		
		System.out.println(name+"what is your grade");
		char grade =input.next().charAt(0);
		System.out.println(name+" has grade "+grade);
		
		System.out.println("Please enter another name");
		name=input.next();
		System.out.println("New name is "+name);
		
		System.out.println("End");
		
		
		
		
		
		

	}

}
