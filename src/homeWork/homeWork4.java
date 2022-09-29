package homeWork;

import java.util.Scanner;

public class homeWork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How old are you");
		
		int old = scanner.nextInt();
		
		if(old>=18)
		{
			System.out.println("We can issue a driver licance to you");
		}
		else
		{
			System.out.println("You should get a learns permit");
		}
	}

}
