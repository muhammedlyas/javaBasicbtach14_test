package homeWork;

import java.util.Scanner;

public class Loops5 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your name");
		String name=input.next();
		
		int i=1;
		
		do {
			System.out.println("Good afternoon "+name);
			i++;
		}while(i<=3);
		
		

	}

}
