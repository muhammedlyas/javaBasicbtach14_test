package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * type casting => type = data type casting =converting
		 */
		
		int number =(int)15.2; // we can not store the decimal number in a box of type int
		System.out.println(number);
		
		byte box1= 127; //smallest box
		short box2= 886; // slightly large box
		int box3=45454545; //large box most commonly used;
		long box4= 414564545; // slightly large box
		float box5=445454545; //large box
		double box6=454545454; //largest
		
		short smallerBox=(byte)box2;
		System.out.println(smallerBox);
		
		

	}

}
