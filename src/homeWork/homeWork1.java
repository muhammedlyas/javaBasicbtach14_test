package homeWork;

import java.util.Scanner;

public class homeWork1 {

	public static void main(String[] args) {
		
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Do you have a diploma? Please enter true or false");
			
			boolean diploma = scanner.nextBoolean();
			
			if(diploma == true)
			{
				System.out.println("Congratulations");
				System.out.println("Please enter your degree");
				int degree = scanner.nextInt();
				
				if(degree>=3.5)
				{
					System.out.println("You are eligible for scholarship");
				}
				else
				{
					System.out.println("You should have studied harder");
				}
			}
			else
			{
				System.out.println("You have to get a diploma");
			}
		}
        	
        	
  
	}

}
