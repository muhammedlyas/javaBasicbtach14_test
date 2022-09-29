package com.syntax.class08;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		
		
	    Scanner input=new Scanner(System.in);
	    int secretNumber=88;
	    int guess;
	    
	    do {
	    	
	    	System.out.println("Please guess the number");
	    	guess=input.nextInt();
	    	
	    }while(guess !=secretNumber);
	   
	    System.out.println("you won");
	    	
	}

}
