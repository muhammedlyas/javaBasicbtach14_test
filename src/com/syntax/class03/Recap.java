package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String concatenation helps us combine a String with any primative data type together 
		 * we can a 
		 */
		String firstName ="Mina";
		String lastName ="Henen";
		String fullName =firstName + "    "  + lastName;
		System.out.println(fullName);
		
		int houseNo =10;
		int apartmentNo =5;
		String streetName="That street";
		String city="New York";
		String country = "USA";
		String fullAddress = apartmentNo+" "+houseNo+" "+streetName+" "+city+" "+country;
		System.out.println(fullAddress);
		
		String step1 ="if we subtract 10 from 5 we get =" +10; //result in a string
		
		System.out.println("if we subtract 10 from 5 we get= "+(10+5));
		
		
		
		

	}

}
