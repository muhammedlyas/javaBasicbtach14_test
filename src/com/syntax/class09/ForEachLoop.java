package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] iceCream= {"vanilla","chocolate","pistashio","kulfi","mango"};
		
		for(String flavor:iceCream) {
			System.out.println(flavor);
		}
		
		char[] letters= {'A','B','C','D'};
		
		for(char letter:letters) {
			
			System.out.println(letter);
		}
	}

}
