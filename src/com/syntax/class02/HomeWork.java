package com.syntax.class02;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte mi1 = 20;
		
		short mi2 = 120;
		
		int mi3 = 120120;
		
		long mi4 = 120120120120L;
		
		float mi5 = 120.120F;
		
		double mi6 =120.120120120;
		
		boolean mi7 = true;
		
		char mi8 = 'M';
		
		System.out.println(mi1);
		System.out.println(mi2);
		System.out.println(mi3);
		System.out.println(mi4);
		System.out.println(mi5);
		System.out.println(mi6);
		System.out.println(mi7);
		System.out.println(mi8);
		
		 String name = "muhammed";
		 String lastName = "ilyas";
		 byte grade = '1';
		 String city = "istanbul";
		 String state = "güngören";
		 String PhoneNumber ="0553 290 04 30";
		 
		 System.out.println("my name is " + name+ "and my last name is " +lastName );
		 System.out.println("I am "+ grade + "student");
		 System.out.println("I live in "+ city + "and state "+ state);
		 System.out.println("And my phone number is "+ PhoneNumber);
		 
		 // changes
		 
		 city = "ankara";
		 state = "beşiktaş";
		 PhoneNumber = "9999 999 99 99";
		 grade ='3';
		 System.out.println("My name is "+ name + " and I moved to new city "+ city + " and new state " + state + " My new phone number is "+ PhoneNumber );
		 
		 // Rules for identifiers = names ( variables, methods 
		 // 1. cannot use keyword as identifiers
		 // String new = "hello" ; -> error
		 
		 //2. cannot have spaces in identifiers 
		 //String last name = "smith"; -> error
		 
		 //3. identifiers cannot start with number
		 // int 1number = 123; -> error
		 
		 //4. identifiers cannot contain any specials characters
		 // except $ or _
		 
		 double $price = 9.98; 
		 float _price1= 1.99F;
		 
		 /*
		  * naming conventions
		  * class should start with Uppercase and follow camel casing
		  * variables should start with lowercase and follow camel casing
		  */
		 
		 String Weather = "hot"; // not referred
		 
		 String myWaether = "hot"; // referred
		 
				 
		
	}

}
