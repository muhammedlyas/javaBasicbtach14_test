package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyBoard5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("did you solve any Repl assignments please enter true or false");
		
		boolean solvedAnyRepls=scanner.nextBoolean();
		
		if(solvedAnyRepls) {
			
			System.out.println("How many Repls you solved");
			int noOfReplsSolved=scanner.nextInt();
			
			if(noOfReplsSolved>=17) {
				System.out.println("you are doing great");
			}
			else if(noOfReplsSolved>10) {
				System.out.println("you are doing ok plaese complete them as soon as possible");
			}
			else
			{
				System.out.println("you should solve some more repls");
			}
			
		}
		else
		{
			System.out.println("they are very important to learn java please solve them");
		}
		

	}

}
