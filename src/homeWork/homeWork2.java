package homeWork;

import java.util.Scanner;

public class homeWork2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("What is your mortgage rate?");
		double rate = scanner.nextDouble();
		
		if(rate>4.5)
		{
			System.out.println("you could not buy a house");
		}
		else
		{
			System.out.println("Do you want to buy a house");
			boolean yes = scanner.nextBoolean();
			
			if(yes ==true)
			{
			System.out.println("what is your amount");
			int price = scanner.nextInt();
			
			if(price<200000)
			{
				System.out.println("You can take a loan");
			}
			else
			{
				System.out.println("You can buy in cash");
			}
		}
			else if(yes == false)
			{
				System.out.println("OK. Thank you");
			}
		
		

	}

}
}