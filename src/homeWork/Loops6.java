package homeWork;

import java.util.Scanner;

public class Loops6 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int coffee=5;
		int price;
		
		System.out.println("Please pay for the coffee");
		
		do {
			price=input.nextInt();
			if(price<coffee)
			{
				System.out.println("Give more");
			}
			else
			{
				System.out.println("Give less");
			}
		}while(price!=5);
		
		System.out.println("Please enjoy your caffee");
		
		

	}

}
