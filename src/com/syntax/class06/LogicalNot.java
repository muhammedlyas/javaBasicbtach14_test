package com.syntax.class06;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean boo = ! true;
		
		System.out.println(boo); // false
		
		boolean boo1 = ! false;
		
		System.out.println(boo1); //true
		
		boolean rain =true;
		
		if(!rain) 
		{
			System.out.println("I will go for a walk");
		}
		
		String day ="Sunday";
		
		if(!day.equals("Sunday"))
		{
			System.out.println("today not sunday");
		}
				
	    System.out.println("End of the program");
	    
	    String day1 ="Monday";
	    
		if(!day1.equals("Sunday"))
		{
			System.out.println("Today not sunday");
		}
				
	    System.out.println("---------------------");
	    
	    boolean checkboxSelected = true;
	    
	    if(!checkboxSelected)
	    {
	    	System.out.println("I will click and select it");
	    }
	    
	    
	
	}
	

}
