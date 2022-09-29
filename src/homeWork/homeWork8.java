package homeWork;

import java.util.Scanner;

public class homeWork8 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter 2 number");
		int num1=input.nextInt();
		int num2=input.nextInt();
		
		System.out.println("operators");
		char operator=input.next().charAt(0);
		
		int sum=num1+num2;
		int sub=num1-num2;
		int divided=num1/num2;
		int multiply=num1*num2;
		
		if(operator=='/')
		{
			System.out.println(divided);
		}
		else if(operator=='*')
		{
			System.out.println(multiply);
		}
		
		switch(operator)
		{
		case '+':
			System.out.println(sum);
			break;
		case '-':
			System.out.println(sub);
			break;
		}
	
         			
		
	}
			

	}

