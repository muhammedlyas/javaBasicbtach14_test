package com.syntax.class09;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] drinks= {"fanta","milk","juice","lemonade"};
		
		System.out.println(drinks[2]); //juice
		
		//how many elements inside my array?
		
		int size=drinks.length; //--> will give 
		
		System.out.println("Size of array= "+size);
		
		String[] iceCream= {"vanilla","chocolate","pistashio","kulfi","mango"};
		
		System.out.println(iceCream[0]);
		
		//how to get all values?
		
		for(int i=0; i<iceCream.length; i++) {
			
			System.out.println(iceCream[i]);
		}

	

	
	
	}
}