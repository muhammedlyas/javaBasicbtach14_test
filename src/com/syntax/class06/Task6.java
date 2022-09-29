package com.syntax.class06;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your quiz");
	    double quiz = input.nextDouble();
	    
	    System.out.println("Please enter your Midterm");
	    double midTerm = input.nextDouble();
	    
	    System.out.println("Please enter your final score");
	    
	    double finalScore = input.nextDouble();
	    
	    double average = (quiz+midTerm+finalScore) / 3;
	    
	    char grade=0;
	    
	    if(average>=90)
	    {
	    	grade = 'A';
	    }
	    else if(average>=70 && average<90)
	    {
	    	grade = 'B';
	    }
	    else if(average>=50 && average<70)
	    {
	    	grade = 'C';
	    }
	    else if(average<50)
	    {
	    	grade = 'F';
	    }
	    
	    System.out.println("Your grade is " + grade);
	    
	}

}
