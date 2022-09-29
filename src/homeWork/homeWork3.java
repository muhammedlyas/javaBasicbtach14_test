package homeWork;

import java.util.Scanner;

public class homeWork3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is the amount of loan is needed?");
		int loan = scanner.nextInt();
		
		
		if(loan<=200000)
		{
			System.out.println("Our bank can give you a loan");
		}
		else
		{
			System.out.println("I m sorry, our bank can not give you a loan");
		}
	}

}
