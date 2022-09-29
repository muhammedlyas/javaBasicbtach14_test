package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {
		

		//matching cases must of same data type as a variable 
		// no duplicated case in switch
		
		char choice = 'N';
		String answer;
		
		switch(choice) 
		{
		case 'Y':
			answer ="Yes";
			break;
		case 'N':
			answer="No";
			break;
		case 'M':
			answer="Maybe";
			break;
			default:
				answer="Unknown";
				break;
			}
		System.out.println(answer);
		
		// Limitations of Switch Case
		/*
		 * switch case cannot use logical operators
		 * switch case cannot relational operators
		 */
		
		/*
		 * CANNOT work with boolean values
		 
		
		boolean boo=true;
		
		switch(boo) {
		
		{
		CANNOT work with float float/double and long
		*/
	}

}
