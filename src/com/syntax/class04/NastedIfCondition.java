package com.syntax.class04;

public class NastedIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * it is called outer if condition if it is true then only inner conditions will be checked 
		 * if it is false nothing from inner if condition will be executed it is like the main door
		 * if main door is closed we can not enter the building
		 */
		
		int time=6;
		
		String day = "monday";
		
		if(day=="monday") { // as string is non primitive we can not use == sign we have to use .equals
			
			if(time>7) {
				System.out.println("lets go to office");
			}
			if(time>1) {
				System.out.println("lets sleep more");
			}
		}

	}

}
