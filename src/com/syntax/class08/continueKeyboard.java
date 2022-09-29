package com.syntax.class08;

public class continueKeyboard {

	public static void main(String[] args) {
		
		for(int i=1; i<5; i++) {
			
			if(i==3)
			{
			continue;
			}
			
			System.out.println("hello");
			System.out.println("How are you");
			System.out.println(i);
		}
		
		for(int i=1; i<=20; i++) {
			
			if(i==3 || i==7 || i==11)
			{
				continue;
			}
			System.out.print(i+" ");
		}

	}

}
